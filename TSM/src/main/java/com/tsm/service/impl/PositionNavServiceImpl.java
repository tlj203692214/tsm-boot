package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.PositionNav;
import com.tsm.mapper.PositionNavMapper;
import com.tsm.service.IPositionNavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2022-02-14
 */
@Service
public class PositionNavServiceImpl extends ServiceImpl<PositionNavMapper, PositionNav> implements IPositionNavService {
    @Autowired
    private PositionNavMapper positionNavMapper;

    @Override
    public int insertPosAndNav(PositionNav positionNav) {
        return positionNavMapper.insert(positionNav);
    }

    @Override
    public int deletePosAndNav(int id) {
        return positionNavMapper.delete(new QueryWrapper<PositionNav>().eq("POSITION_ID",id));
    }

    //    查询角色权限表的所有的数据
    @Override
    public List<PositionNav> selectPosAndNav() {
        return positionNavMapper.selectList(null);
    }



}
