package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.TimeTableVoMapper;
import com.tsm.service.serviceVo.TimeTableVoService;
import com.tsm.vo.TimeTableVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimeTableVoImpl extends ServiceImpl<TimeTableVoMapper, TimeTableVo> implements TimeTableVoService {
    @Autowired
    private TimeTableVoMapper mapper;

    @Override
    public IPage<TimeTableVo> selectTimeTableVo(int page, int size, String name) {
        QueryWrapper<TimeTableVo> wrapper=new QueryWrapper<>();
        Page<TimeTableVo> page1=new Page<>(page,size);
        if (name!=null&&name.length()!=0){
            wrapper.like("cla.CLASSES_NAME",name);
        }
        wrapper.eq("tim.DELETED",0);
        wrapper.orderByDesc("tim.TEACHING_ID");
        IPage<TimeTableVo> iPage=mapper.selectTimeTableVo(page1,wrapper);
        return iPage;
    }

    @Override
    public List<TimeTableVo> selectlist() {
        QueryWrapper<TimeTableVo> wrapper=new QueryWrapper<>();
        wrapper.eq("tim.DELETED",0);
        wrapper.orderByDesc("tim.TEACHING_ID");
        List<TimeTableVo> list=mapper.selectTimeTableVolist(wrapper);
        return list;
    }
}
