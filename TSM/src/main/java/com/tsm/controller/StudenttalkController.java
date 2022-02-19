package com.tsm.controller;


import com.tsm.entity.Studenttalk;
import com.tsm.service.IStudentattendService;
import com.tsm.service.IStudenttalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/studenttalk")
public class StudenttalkController {
    @Autowired
    private IStudenttalkService service;

    @PostMapping("/addstudenttalk")
    public int addstudenttalk(@RequestBody Studenttalk studenttalk){
        int a=service.addstudenttalk(studenttalk);
        return a;
    }

    @PostMapping("/delectstudenttalk")
    public int delectstudenttalk(@RequestBody Studenttalk studenttalk){
        int a=service.delectstudenttalk(studenttalk);
        return a;
    }
}
