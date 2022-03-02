package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Staff;
import com.tsm.handler.MD5Utils;
import com.tsm.mapper.StaffMapper;
import com.tsm.service.IStaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff> implements IStaffService {

    @Autowired
    private StaffMapper staffMapper;
    @Autowired
    private MD5Utils md5Utils;
    @Override
    public Staff selectStaff(String staffName, String staffPass) {
        String Pass = md5Utils.md5(staffPass);
        QueryWrapper<Staff> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("STAFF_NAME",staffName)
                .eq("STAFF_PASS",Pass);
        Staff staff = staffMapper.selectOne(queryWrapper);
        return staff;
    }

    @Override
    public List<Staff> selectstaffqudao() {

        return staffMapper.selectList(null);
    }

    @Override
    public int updateStaff(int staffid) {
        Staff s1 = staffMapper.selectById(staffid);
        System.out.println("状态1111"+s1.getStaffState());
        if (s1.getStaffState()==0){
            s1.setStaffState(1);
            log.debug("员工辞退成功");
        }else{
            s1.setStaffState(0);
            log.debug("员工恢复成功");
        }
        int update = staffMapper.updateById(s1);
        return update;
    }

    @Override
    public int addStaff(Staff staff) {
        String pass = md5Utils.md5(staff.getStaffPass());
        staff.setStaffPass(pass);
        int add = staffMapper.insert(staff);
        return add;
    }

    @Override
    public long staffCount() {
        QueryWrapper<Staff> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        Long count = staffMapper.selectCount(wrapper);
        return count;
    }

}
