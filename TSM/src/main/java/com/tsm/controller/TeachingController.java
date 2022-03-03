package com.tsm.controller;


import com.tsm.entity.Teaching;
import com.tsm.service.ITeachingService;
import com.tsm.service.impl.TeachingServiceImpl;
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
@RequestMapping("/teaching")
public class TeachingController {
@Autowired
    private ITeachingService service;
@PostMapping("/addteaching")
    public int addteaching(@RequestBody Teaching teaching){
    int a=service.addteaching(teaching);
    return a;
}
@GetMapping("/selectid")
    public int selectid(){
    int a=service.selectmax();
    return a;
    }
}
