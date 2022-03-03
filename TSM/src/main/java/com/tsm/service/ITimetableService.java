package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Timetable;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface ITimetableService extends IService<Timetable> {
    //添加
    public int addtimetable(Timetable timetable);
    //修改是否删除
    public int deletedtimetable(Timetable timetable);
    //修改状态
    public int deletedtimetablezt(Timetable timetable);
}
