package com.tsm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tsm.entity.Staff;
import com.tsm.mapper.StaffMapper;
import com.tsm.service.IStaffService;
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
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private IStaffService iStaffService;

    /**
     * 登录
     * @param staff
     * @return
     */
    @PostMapping("/selectStaff")
    public Staff selectStaff(@RequestBody Staff staff){
        String name = staff.getStaffName();
        String pass = staff.getStaffPass();
        Staff staff2 =iStaffService.selectStaff(name,pass);
        return staff2;
    }

    @GetMapping("/selectstaffqudao")
    public List<Staff> selectstaffqudao1(){
        List<Staff> list=iStaffService.selectstaffqudao();
        return list;
    }

    @PostMapping("/upstaffstate/{staffid}")
    public int updatestaff(@PathVariable("staffid") int staffid){
        int upstaff = iStaffService.updateStaff(staffid);
        if (upstaff>0){
            log.debug("修改成功");
        }else{
            log.debug("修改失败");
        }
        return upstaff;
    }

    @Autowired
    private StaffMapper staffMapper;
    @PostMapping("/cxyh")
    public List<Staff> cxyh(@RequestBody Staff staff){
        int id=staff.getStaffId();
        String name=staff.getStaffName();
        if(id==0){
            QueryWrapper<Staff> wrapper=new QueryWrapper<>();
            wrapper.eq("DELETED",0)
                    .inSql("STAFF_NAME","select STAFF_NAME from STAFF where STAFF_NAME like '%"+name+"%'");
            List<Staff> staff1=staffMapper.selectList(wrapper);
            System.out.println("aaaaaas"+name);
            System.out.println("ssssssssssss"+staff1);
            return  staff1;
        }else{

            List<Staff> staff1=staffMapper.selectStaff(id,name);
            System.out.println("aaaaaas"+name);
            System.out.println("ssssssssssss"+staff1);
            return  staff1;
        }

    }

}
