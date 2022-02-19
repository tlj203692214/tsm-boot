package com.tsm.controller;


import com.tsm.entity.Staffleave;
import com.tsm.service.IStaffleaveService;
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
}
