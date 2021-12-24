package com.tsm.controller;


import com.tsm.entity.Satffsign;
import com.tsm.service.ISatffsignService;
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
@CrossOrigin(maxAge = 60)
public class SatffsignController {
    @Autowired
    private ISatffsignService service;
    //修改打卡状态和时间
    @PostMapping("/updatestaffsign")
    public int UpdateStaffsign(@RequestBody Satffsign satffsign){
        int daka = service.updateStaffsign(satffsign);
        System.out.println(daka);
        return daka;
    }
}
