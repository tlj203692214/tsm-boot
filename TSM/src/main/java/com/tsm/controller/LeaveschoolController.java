package com.tsm.controller;


import com.tsm.entity.Leaveschool;
import com.tsm.service.ILeaveschoolService;
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
@RequestMapping("/leaveschool")
public class LeaveschoolController {
@Autowired
    private ILeaveschoolService service;
@PostMapping("/addleave")
    public int addleave(@RequestBody Leaveschool leaveschool){
    int a=service.addleaveschool(leaveschool);
    return a;
}
@GetMapping("/selectid")
    public int selectid(){
    int a=service.selectid();
    return a;
}
}
