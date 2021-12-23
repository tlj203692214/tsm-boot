package com.tsm.controller;


import com.tsm.entity.Course;
import com.tsm.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/course")
public class CourseController {
@Autowired
    private CourseServiceImpl courseService;

@GetMapping("selectcourse")
public List<Course> selectcourse1(){
    List<Course> list=courseService.selectcorse();
    return list;
}
}
