package com.tsm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tsm.entity.Position;
import com.tsm.entity.Staff;
import com.tsm.mapper.StaffMapper;
import com.tsm.service.IPositionService;
import com.tsm.service.IStaffPositionService;
import com.tsm.service.IStaffService;
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
@RestController
@CrossOrigin(maxAge = 60)
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private IStaffService iStaffService;

    @Autowired
    private StaffMapper staffMapper;
    /**
     * 登录
     * @param staff
     * @return
     */
    @PostMapping("/selectStaff")
    public Staff selectStaff(@RequestBody Staff staff) {
        String name = staff.getStaffName();
        String pass = staff.getStaffPass();
        Staff staff2 = iStaffService.selectStaff(name, pass);
        return staff2;
    }

    /**
     * 查询渠道
     * @return
     */
    @GetMapping("/selectstaffqudao")
    public List<Staff> selectstaffqudao1() {
        List<Staff> list = iStaffService.selectstaffqudao();
        return list;
    }


    @PostMapping("/addstaff")
    public int addstaff(@RequestBody Staff staff){
        int add = iStaffService.addStaff(staff);
        if (add>0){
            System.out.println("新增成功");
        }else{
            System.out.println("新增失败");
        }
        int sid = staff.getStaffId();
        System.out.println("新增的员工id为"+sid);
        return sid;
    }

    /**
     * 修改用户状态
     * @param staffid
     * @return
     */
    @PostMapping("/upstaffstate/{staffid}")
    public int upstaffstate(@PathVariable("staffid") int staffid){
        int update = iStaffService.updateStaff(staffid);
        return update;
    }

    @PostMapping("/cxyh")
    public List<Staff> cxyh(@RequestBody Staff staff) {
        int id = staff.getStaffId();
        String name = staff.getStaffName();
        if (id == 0) {
            QueryWrapper<Staff> wrapper = new QueryWrapper<>();
            wrapper.eq("DELETED", 0)
                    .inSql("STAFF_NAME", "select STAFF_NAME from STAFF where STAFF_NAME like '%" + name + "%'");
            List<Staff> staff1 = staffMapper.selectList(wrapper);
            return staff1;
        } else {
            List<Staff> staff1 = staffMapper.selectStaff(id, name);
            return staff1;
        }

    }
    @PostMapping("/updatePass")
    public int updatePass(@RequestBody Staff staff) {
        int a=iStaffService.updatePass(staff);
        return a;
    }
    @PostMapping("/md5/{staffPass}")
    public String md5(@PathVariable("staffPass") String staffPass) {
        String Pass=iStaffService.md5(staffPass);
        return Pass;
    }
}
