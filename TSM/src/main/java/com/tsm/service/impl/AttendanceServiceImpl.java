package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Attendance;
import com.tsm.mapper.AttendanceMapper;
import com.tsm.service.IAttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class AttendanceServiceImpl extends ServiceImpl<AttendanceMapper, Attendance> implements IAttendanceService {
    @Autowired
    private AttendanceMapper attendanceMapper;
    @Override
    public int addAttendance(Attendance attendance) {
        Integer id = attendance.getStaffId();
        Attendance a1 = new Attendance();
        a1.setAttendanceDate(new Date());
        a1.setStaffId(id);
        int insert = attendanceMapper.insert(a1);
        if (insert>0){
            log.debug("新增成功！");
        }else{
            log.debug("新增失败！");
        }
        return insert;
    }
}
