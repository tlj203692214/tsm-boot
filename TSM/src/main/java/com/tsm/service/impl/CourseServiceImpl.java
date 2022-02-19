package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Course;
import com.tsm.mapper.CourseMapper;
import com.tsm.service.ICourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements ICourseService {

    @Autowired
    private CourseMapper courseMapper;
    @Override
    public List<Course> selectcorse() {
        List<Course> courses=courseMapper.selectList(null);
        return courses;
    }

    @Override
    public IPage<Course> fyselectcourse(int page, int size) {
        Page<Course> page1=new Page<>(page,size);
        QueryWrapper<Course> wrapper=new QueryWrapper<>();
        wrapper.orderByDesc("COURSE_ID");
        IPage<Course> iPage=courseMapper.selectPage(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<Course> mohuselect(int page , int size, String name) {
        Page<Course> page1=new Page<>(page,size);
        QueryWrapper<Course> wrapper=new QueryWrapper<>();
        wrapper.like("COURSE_NAME",name);
        IPage<Course> iPage=courseMapper.selectPage(page1,wrapper);
        return iPage;
    }

    @Override
    public int addcourse(Course course) {
        int a=courseMapper.insert(course);
        return a;
    }
}
