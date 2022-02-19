package com.tsm.controller;


import com.tsm.entity.Classroom;
import com.tsm.service.IClassroomService;
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
@RequestMapping("/classroom")
public class ClassroomController {
    @Autowired
    private IClassroomService service;
    //查询教室
    @GetMapping("/selectlistclassroom")
    public List<Classroom> selectlistclassroom(){
        List<Classroom> list=service.selectlistclassroom();
        return list;
    }
}
