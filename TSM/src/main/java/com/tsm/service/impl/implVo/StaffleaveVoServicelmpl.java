package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Personal;
import com.tsm.mapper.PersonalMapper;
import com.tsm.mapper.voMapper.StaffleaveVoMapper;
import com.tsm.service.serviceVo.IStaffleaveVoService;
import com.tsm.vo.StaffleaveVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StaffleaveVoServicelmpl extends ServiceImpl<StaffleaveVoMapper,StaffleaveVo> implements IStaffleaveVoService {

    @Autowired
    private StaffleaveVoMapper voMapper;
    @Autowired
    private PersonalMapper personalMapper;
    @Override
    public IPage<StaffleaveVo> findleaveVo(String st, String it, int page, int size) {
        Page<StaffleaveVo> page1 = new Page<>(page,size);
        QueryWrapper<StaffleaveVo> wrapper = new QueryWrapper<>();
        wrapper.eq("sl.DELETED",0);
        if (st.equals("1")){

        }else if (st.equals("2")){
            wrapper.eq("sl.LEAVE_STATE",2);
        }else if(st.equals("3")){
            wrapper.isNotNull("sl.STAFF_ID2");
            wrapper.eq("sl.LEAVE_STATE",1);
        }else if(st.equals("4")){
            wrapper.isNotNull("sl.STAFF_ID2");
            wrapper.eq("sl.LEAVE_STATE",0);
        }else if (st.equals("5")){
            wrapper.eq("sl.LEAVE_STATE",3);
        }
        wrapper.like("ps.PERSONAL_NAME",it);
        IPage<StaffleaveVo> iPage = voMapper.findleaveVo(page1,wrapper);
        return iPage;
    }

    @Override
    public List<StaffleaveVo> listStaffleaveVo() {
        List<StaffleaveVo> list = voMapper.listleaveVo();
        Date date = new Date();
        System.out.println("系统时间"+date);
        //查询请假信息时间，请假成功信息超过当前时间修改员工状态为正常
        for (int i=0;i<list.size();i++){
            StaffleaveVo s = list.get(i);
            System.out.println("数据库时间"+s.getEndTime());
            if (date.getTime()>s.getEndTime().getTime()&&s.getLeaveState()==1){
                Personal personal = personalMapper.selectById(s.getPersonalId());
                if (personal.getPersonalState()==2){
                    personal.setPersonalState(1);
                    System.out.println("员工休假结束。。");
                }
                personalMapper.updateById(personal);
            }
        }
        return list;
    }
}
