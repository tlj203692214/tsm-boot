package com.tsm.controller;


import com.tsm.entity.Attendance;
import com.tsm.service.IAttendanceService;
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
@RequestMapping("/attendance")
public class AttendanceController {
    @Autowired
    private IAttendanceService service;
    @PostMapping("/addattendance")
    public int addattendance(@RequestBody Attendance attendance){
        int add = service.addAttendance(attendance);
        System.out.println("新增"+add+"条数据");
        return add;
    }
    @GetMapping("/attendancebyid/{staffid}")
    public List<Attendance> attendancesByid(@PathVariable("staffid") int staffid){
        List<Attendance> list = service.AttendancesByid(staffid);
        log.debug(list.toString());
        return list;
    }
}
