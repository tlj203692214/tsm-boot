package com.tsm.controller;


import com.tsm.entity.Staffleave;
import com.tsm.service.IStaffleaveService;
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
@RequestMapping("/staffleave")
public class StaffleaveController {
    @Autowired
    private IStaffleaveService service;
    @PostMapping("/insetleave")
    public int Insertleave(@RequestBody Staffleave staffleave){
        int add = service.addstaffleave(staffleave);
        System.out.println("新增数据"+add+"条");
        return add;
    }
    //查询所有员工请假信息
    @GetMapping("/booleanleave")
    public List<Staffleave> listStaffleave(){
        List<Staffleave> list = service.listStaffleave();
        return list;
    }
    //员工请假审批
    @PostMapping("/upstaffleave")
    public int Upstaffleave(@RequestBody Staffleave staffleave){
        int update = service.updateStaffleave(staffleave);
        if (update>0){
            log.debug("请假成功"+update);
        }else{
            log.debug("请假失败");
        }
        return update;
    }
    //员工过期请假删除
    @PostMapping("/delstaffleave/{sid}")
    public int delsatffleave(@PathVariable("sid") int lid){
        int del = service.delStaffleave(lid);
        if (del>0){
            log.debug("删除成功"+del);
        }else{
            log.debug("删除失败");
        }
        return del;
    }
}
