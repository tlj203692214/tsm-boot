package com.tsm.controller;


import com.tsm.entity.Studentfiles;
import com.tsm.service.impl.StudentfilesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/studentfiles")
public class StudentfilesController {
    @Autowired
    private StudentfilesServiceImpl service;
    //添加意向学生档案
    @PostMapping("/addstudentfiles")
    public int addstudentfiles(@RequestBody Studentfiles studentfiles){
        int a=service.addStudenfiles(studentfiles);
        return a;
    }
}
