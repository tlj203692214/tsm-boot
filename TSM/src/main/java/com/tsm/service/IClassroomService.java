package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Classroom;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IClassroomService extends IService<Classroom> {
    //查询教室
    public List<Classroom> selectlistclassroom();
}
