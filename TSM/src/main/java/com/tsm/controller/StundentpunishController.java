package com.tsm.controller;


import com.tsm.entity.Stundentpunish;
import com.tsm.service.IStundentpunishService;
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
@RequestMapping("/stundentpunish")
public class StundentpunishController {
    @Autowired
    private IStundentpunishService service;

    @PostMapping("/addstudentpun")
    public int addstudentpun(@RequestBody Stundentpunish stundentpunish){
        int a= service.addstudentpun(stundentpunish);
        return a;
    }

    @PostMapping("/delectstudentpun")
    public int delectstudentpun(@RequestBody Stundentpunish stundentpunish){
        int a= service.delectstudentpun(stundentpunish);
        return a;
    }
}
