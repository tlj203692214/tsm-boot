package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.StaffPosition;
import com.tsm.mapper.StaffPositionMapper;
import com.tsm.service.IStaffPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class StaffPositionServiceImpl extends ServiceImpl<StaffPositionMapper, StaffPosition> implements IStaffPositionService {
    @Autowired
    private StaffPositionMapper staffPositionMapper;

    @Override
    public int insertStaffPos(StaffPosition staffPosition) {
        return staffPositionMapper.insert(staffPosition);
    }

    @Override
    public int[] selectPositionById(int id) {
        return staffPositionMapper.selectPositionByStaffId(id);
    }

    @Override
    public int deletedStaffAndPos(int id) {
        return staffPositionMapper.delete(new QueryWrapper<StaffPosition>().eq("STAFF_ID",id));
    }
}
