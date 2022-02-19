package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Position;
import com.tsm.mapper.PositionMapper;
import com.tsm.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class PositionServiceImpl extends ServiceImpl<PositionMapper, Position> implements IPositionService {
    @Autowired
    private PositionMapper positionMapper;

    @Override
    public IPage<Position> selectPosition(int size, int page,String name) {
        Page<Position> page1 = new Page<>(size,page);
        QueryWrapper<Position> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByAsc("POSITION_ID");
        queryWrapper.like("POSITION_NAME",name);
        IPage<Position> positionPage = positionMapper.selectPage(page1, queryWrapper);
        return positionPage;
    }

    /**
     * 查询所有的角色
     * @return
     */
    @Override
    public List<Position> selectPositionAll() {
        return positionMapper.selectList(null);
    }

    @Override
    public int insertPosition(Position position) {
        return positionMapper.insert(position);
    }

    @Override
    public int updatePosition(Position position) {
        return positionMapper.updateById(position);
    }
}
