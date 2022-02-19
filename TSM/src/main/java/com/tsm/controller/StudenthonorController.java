package com.tsm.controller;


import com.tsm.entity.Studenthonor;
import com.tsm.service.IStudenthonorService;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@RestController
@RequestMapping("/studenthonor")
@CrossOrigin(maxAge = 60)
public class StudenthonorController {

    @Autowired
    private IStudenthonorService service;
    //添加荣誉
    @PostMapping("/addstudenthon")
    public int addstudnethon(@RequestBody Studenthonor studenthonor){
        int a=service.addstudenthon(studenthonor);
        return a;
    }
    //删除荣誉
    @PostMapping("/delectry")
    public int delectstudenthon(@RequestBody Studenthonor studenthonor){
        int a = service.delectry(studenthonor);
        return a;
    }

}
