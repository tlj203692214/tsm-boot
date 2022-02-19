package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.PositionNavVoMapper;
import com.tsm.service.serviceVo.PositionNavVoService;
import com.tsm.vo.positionNavVo;
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
public class PositionNavVoServiceImpl extends ServiceImpl<PositionNavVoMapper, positionNavVo> implements PositionNavVoService {
    @Autowired
    private PositionNavVoMapper positionNavVoMapper;

    /**
     * 根据角色id查询权限
     */
    @Override
    public int[] selectPosById(int id) {
        return positionNavVoMapper.selectNavByPositionId(id);
    }

}
