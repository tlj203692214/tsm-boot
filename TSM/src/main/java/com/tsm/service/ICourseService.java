package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Course;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface ICourseService extends IService<Course> {
    //查询课程
public List<Course> selectcorse();

//分页查询课程
    public IPage<Course> fyselectcourse(int page,int size);
    //名称模糊查询
    public IPage<Course> mohuselect(int page , int size, String name);
}
