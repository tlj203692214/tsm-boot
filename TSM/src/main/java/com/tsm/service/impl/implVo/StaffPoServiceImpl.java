package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.FollowVoMapper;
import com.tsm.mapper.voMapper.StaffPositionVoMapper;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.service.serviceVo.StaffPositionService;
import com.tsm.vo.FollowVo;
import com.tsm.vo.StaffPositionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StaffPoServiceImpl extends ServiceImpl<StaffPositionVoMapper, StaffPositionVo> implements StaffPositionService {
    @Autowired
    private StaffPositionVoMapper staffPositionVoMapper;

    @Override
    public List<StaffPositionVo> selectlist() {
        QueryWrapper<StaffPositionVo> wrapper=new QueryWrapper<>();
        wrapper.eq("s.POSITION_ID",3);
        List<StaffPositionVo> list=staffPositionVoMapper.selectList(wrapper);
        return list;
    }

    @Override
    public List<StaffPositionVo> selectjwk() {
        QueryWrapper<StaffPositionVo> wrapper=new QueryWrapper<>();
        wrapper.eq("s.POSITION_ID",2);
        wrapper.or().eq("s.POSITION_ID",4);
        List<StaffPositionVo> list=staffPositionVoMapper.selectList(wrapper);
        return list;
    }
}
