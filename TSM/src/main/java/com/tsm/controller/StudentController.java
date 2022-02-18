package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Student;
import com.tsm.service.IStudentService;
import com.tsm.vo.stujihe;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.RequestWrapper;
import java.util.List;

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
    //添加学员
    @PostMapping("/addstudent")
    public int addstudent(@RequestBody Student student){
        int a=service.addstudnet(student);
        return a;
    }
    //学员转班修改
    @PostMapping("/updatastudentzb")
    public int updatastudentzb(@RequestBody Student student){
        int a=service.updatastudentzb(student);
        return a;
    }

    //根据课程编号查询
    @GetMapping("/selectxs/{id}")
    public List<Student> selectxs(@PathVariable(name = "id") String id){
        List<Student> list1=service.list(id);
        return list1;
    }
    @GetMapping("/selectkcbj/{id1}/{id2}")
    public List<Student> selectkcbj(@PathVariable(name = "id1") String id1,@PathVariable(name = "id2") String id2){
        List<Student> students=service.bjkclist(id1, id2);
        return students;
    }

    //添加显学生班级课程
    @PostMapping("/xgstudent")
    public int xgstudent(@RequestBody Student student){
       int a=service.updatastudentbjkc(student);
        return a;
    }
    @PostMapping("/xgstudentkcbj")
    public int xgstudent1(@RequestBody Student student){
        int a=service.updatastudentbjkc1(student);
        return a;
    }

    @GetMapping("/bjselect/{id}")
    public List<Student> cxlist(@PathVariable(name = "id") String id){
        List<Student> list=service.listselectstudent(id);
        return list;
    }

    @PostMapping("/xgstudentzt")
    public int updatastudentzt(@RequestBody Student student){
        int a =service.updatastudentzt(student);
        return a;
    }

}
