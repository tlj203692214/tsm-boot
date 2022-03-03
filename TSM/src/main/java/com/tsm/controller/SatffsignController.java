package com.tsm.controller;


import com.tsm.entity.Satffsign;
import com.tsm.service.ISatffsignService;
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
    //查询所有员工打卡
    @GetMapping("/staffsignlist")
    public List<Satffsign> StaffsignList(){
        List<Satffsign> list = service.StaffsignList();
        return list;
    }

    //员工转正新增员工打卡
    @PostMapping("/addstaffsign")
    public int addstaffsign(@RequestBody Satffsign satffsign){
        int add = service.addStaffsign(satffsign);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }

    //统计员工出勤人数
    @GetMapping("/staffsignCount")
    public Long staffsignCount(){
        long count = service.StaffSignCount();
        log.debug("出勤员工"+count);
        return count;
    }
}
