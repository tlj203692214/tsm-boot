package com.tsm.controller;


import com.tsm.entity.Timetable;
import com.tsm.service.ITimetableService;
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
@RequestMapping("/timetable")
public class TimetableController {
@Autowired
    private ITimetableService service;
@PostMapping("/addtimetable")
    public int addtimetable(@RequestBody Timetable timetable){
    int a= service.addtimetable(timetable);
    return a;
}
@PostMapping("/deletedtimetable")
    public int deletedtimetable(@RequestBody Timetable timetable){
    int a=service.deletedtimetable(timetable);
    return a;
}

    @PostMapping("/deletedtimetablezt")
    public int deletedtimetablezt(@RequestBody Timetable timetable){
        int a=service.deletedtimetablezt(timetable);
        return a;
    }
}
