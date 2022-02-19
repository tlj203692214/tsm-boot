package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.StaffPositionVo;

import java.util.List;

public interface StaffPositionService extends IService<StaffPositionVo> {
    //查询财务的用户
    public List<StaffPositionVo> selectlist();
    //查询教务科主任和校长
    public List<StaffPositionVo> selectjwk();
}
