package com.tsm.controller;


import com.tsm.entity.Graduation;
import com.tsm.service.IGraduationService;
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
@RequestMapping("/graduation")
public class GraduationController {
    @Autowired
    private IGraduationService service;

    @PostMapping("/addgra")
    public int addgra(@RequestBody Graduation graduation){
        int a=service.addgraduation(graduation);
        return a;
    }

    @PostMapping("/updatezt")
    public int updatezt(@RequestBody Graduation graduation){
        int a=service.updatazt(graduation);
        return a;
    }
}
