package com.tsm.controller;


import com.tsm.entity.Outwarehouse;
import com.tsm.service.IOutwarehouseService;
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
@RequestMapping("/outwarehouse")
public class OutwarehouseController {
@Autowired
    private IOutwarehouseService service;
@PostMapping("/addout")
    public int addout(@RequestBody Outwarehouse outwarehouse){
    int a=service.addoutwar(outwarehouse);
    return a;
}

@PostMapping("/updateout")
    public int updateout(@RequestBody Outwarehouse outwarehouse){
    int a=service.updateoutwar(outwarehouse);
    return a;
}
}
