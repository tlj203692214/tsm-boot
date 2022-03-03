package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.TimeTableVo;

import java.util.List;

public interface TimeTableVoService extends IService<TimeTableVo> {
    public IPage<TimeTableVo> selectTimeTableVo(int page,int size,String name);

    public List<TimeTableVo> selectlist();
}
