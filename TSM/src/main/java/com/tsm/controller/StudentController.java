package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Student;
import com.tsm.service.IStudentService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("/student")
@CrossOrigin(maxAge = 60)
public class StudentController {
    @Autowired
    private IStudentService service;
    @GetMapping("/studentcount")  // 页面自动调用
    public Long StudentCount(){
        Long count = service.student(0);
        log.debug(count.toString());
        return count;
    }
    //编辑学员
    @PostMapping("/updatastudent")
    public int updatastudent(@RequestBody Student student){
        int a=service.updatastudent(student);
        return a;
    }
}
