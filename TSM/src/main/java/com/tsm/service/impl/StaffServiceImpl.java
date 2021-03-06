package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Staff;
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

    @Override
    public Staff selectStaff(String staffName, String staffPass) {
        QueryWrapper<Staff> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("STAFF_NAME",staffName)
                .eq("STAFF_PASS",staffPass);
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
        System.out.println("状态1111"+s1.getDeleted());
        if (s1.getDeleted()==0){
            s1.setDeleted(1);
            log.debug("员工辞退成功");
        }else{
            s1.setDeleted(0);
            log.debug("员工恢复成功");
        }
        int update = staffMapper.updateById(s1);
        return update;
    }


}
