package com.tsm.controller;


import com.tsm.entity.Staff;
import com.tsm.service.IStaffService;
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
@CrossOrigin(maxAge = 60)
public class StaffController {
    @Autowired
    private IStaffService iStaffService;

    @PostMapping("/selectStaff")
    public Staff selectStaff(@RequestBody Staff staff){
        String name = staff.getStaffName();
        String pass = staff.getStaffPass();
        Staff staff2 =iStaffService.selectStaff(name,pass);
        return staff2;
    }

}
