package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Personal;
import com.tsm.entity.Staffleave;
import com.tsm.mapper.StaffleaveMapper;
import com.tsm.service.IStaffleaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class StaffleaveServiceImpl extends ServiceImpl<StaffleaveMapper, Staffleave> implements IStaffleaveService {

    @Autowired
    private StaffleaveMapper mapper;
    @Override
    public int addstaffleave(Staffleave staffleave) {
        int add = mapper.insert(staffleave);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }

    @Override
    public List<Staffleave> listStaffleave() {
        QueryWrapper<Staffleave> wrapper = new QueryWrapper<>();
        List<Staffleave> list = mapper.selectList(wrapper);
        Date date = new Date();
        System.out.println("系统时间"+date);
        //查询请假信息时间，超过请假时间修改状态为已过期
        for (int i=0;i<list.size();i++){
            Staffleave s = list.get(i);
            System.out.println("数据库时间"+s.getEndTime());
            if (date.getTime()>s.getEndTime().getTime()&&s.getLeaveState()==2){
                s.setLeaveState(3);
                log.debug("员工请假已过期");
                log.debug("状态"+s.getLeaveState());
            }
            mapper.updateById(s);
        }
        return list;
    }

    @Override
    public int updateStaffleave(Staffleave staffleave) {
        Date date = new Date();
        if (date.getTime()>staffleave.getBeginTime().getTime()){
            staffleave.setBeginTime(date);
        }
        int update = mapper.updateById(staffleave);
        return update;
    }

    @Override
    public int delStaffleave(int lid) {
        Staffleave leave = mapper.selectById(lid);
        leave.setDeleted(1);
        int del = mapper.updateById(leave);
        return del;
    }


}
