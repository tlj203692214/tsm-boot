package com.tsm.controller;


import com.tsm.entity.Classes;
import com.tsm.service.IClassesService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
@RequestMapping("/classes")
public class ClassesController {
    @Autowired
    private IClassesService service;
    @GetMapping("/classcount")
    public Long ClassCount(){
        Long count = service.ClasssCount(0);
        log.debug(count.toString());
        return count;
    }

    @PostMapping("/cxclasscount")
    public List<Classes> cxclasses(){
        List<Classes> list=service.cx();
        return list;
    }
}
