package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Timetable;
import com.tsm.mapper.TimetableMapper;
import com.tsm.service.ITimetableService;
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
public class TimetableServiceImpl extends ServiceImpl<TimetableMapper, Timetable> implements ITimetableService {
@Autowired
    private TimetableMapper mapper;

    @Override
    public int addtimetable(Timetable timetable) {
        int a=mapper.insert(timetable);
        return a;
    }

    @Override
    public int deletedtimetable(Timetable timetable) {
        int a=mapper.deletedtim(timetable);
        return a;
    }

    @Override
    public int deletedtimetablezt(Timetable timetable) {
        int a=mapper.deletedtimzt(timetable);
        return a;
    }
}
