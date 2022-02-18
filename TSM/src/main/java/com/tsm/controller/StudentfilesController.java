package com.tsm.controller;


import com.tsm.entity.Follow;
import com.tsm.entity.Studentfiles;
import com.tsm.service.impl.StudentfilesServiceImpl;
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
@RequestMapping("/studentfiles")
public class StudentfilesController {
    @Autowired
    private StudentfilesServiceImpl service;

    //添加意向学生档案
    @PostMapping("/addstudentfiles")
    public int addstudentfiles(@RequestBody Studentfiles studentfiles) {
        int a = service.addStudenfiles(studentfiles);
        return a;
    }

    //编辑意向学生档案
    @PostMapping("/updatestudentfiles")
    public int updatestudentfiles(@RequestBody Studentfiles studentfiles) {
        System.out.println(studentfiles.getCourseId());
        int a = service.updateStudenfiles(studentfiles);
        return a;
    }
    //意向学员改为已流失状态
    @PostMapping("xgselectfollow")
    public int  xgselect(@RequestBody Studentfiles studentfiles){
        int a=service.updatestudenfileszt(studentfiles);
        return a;
    }
    //激活意向学员
    @PostMapping("jhselectfollow")
    public int jhselectfollow(@RequestBody Studentfiles studentfiles){
            int a=service.updatestudenfilesjhzt(studentfiles);
            return  a;
    }
    //删除意向学员
    @PostMapping("/scselectfollow")
        public int scselectfolow(@RequestBody Studentfiles studentfiles){
        int a=service.scselect(studentfiles);
        return a;
    }
    //修改意向学员变成已报名
    @PostMapping("/updatefollow")
    public int updatefollow(@RequestBody Studentfiles studentfiles){
        int a=service.updatestudnetzt(studentfiles);
        return a;
    }
}
