package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Course;
import com.tsm.service.impl.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
//查询课程名称
@GetMapping("selectcourse")
public List<Course> selectcourse1(){
    List<Course> list=courseService.selectcorse();
    return list;
}
//分页查询课程
    @GetMapping("fyselectcourse")
    public IPage<Course> fyselectcourse(@RequestParam("currentPage") int page, @RequestParam("size") int size){
        IPage<Course> iPage=courseService.fyselectcourse(page, size);
        return iPage;
    }
    //名称模糊查询
    @GetMapping("mohuselect")
    public IPage<Course> mohuselect(@RequestParam("currentPage") int page,@RequestParam("size") int size, @RequestParam("kcmc") String name){
        IPage<Course> iPage=courseService.mohuselect(page,size,name);
        return iPage;
    }
}
