package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Staffbusiness;
import com.tsm.mapper.StaffbusinessMapper;
import com.tsm.service.IStaffbusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
public class StaffbusinessServiceImpl extends ServiceImpl<StaffbusinessMapper, Staffbusiness> implements IStaffbusinessService {
    @Autowired
    private StaffbusinessMapper mapper;
    @Override
    public IPage<Staffbusiness> findbusiness(String st, int page, int size) {
        Page<Staffbusiness> page1 = new Page<>(page,size);
        QueryWrapper<Staffbusiness> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        if (st.equals("1")){

        }else if (st.equals("2")){
            wrapper.eq("STAFFBUSINESS_STATE",2);
        }else if(st.equals("3")){
            wrapper.isNotNull("STAFF_ID2");
            wrapper.eq("STAFFBUSINESS_STATE",1);
        }else if(st.equals("4")){
            wrapper.isNotNull("STAFF_ID2");
            wrapper.eq("STAFFBUSINESS_STATE",0);
        }else if (st.equals("5")){
            wrapper.eq("STAFFBUSINESS_STATE",3);
        }
        wrapper.orderByDesc("STAFFBUSINESS_ID");
        IPage<Staffbusiness> iPage = mapper.selectPage(page1,wrapper);
        return iPage;
    }

    @Override
    public int addstaffbusiness(Staffbusiness staffbusiness) {
        int add = mapper.insert(staffbusiness);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }

    @Override
    public List<Staffbusiness> listStaffbusiness() {
        QueryWrapper<Staffbusiness> wrapper = new QueryWrapper<>();
        List<Staffbusiness> list = mapper.selectList(wrapper);
        Date date = new Date();
        System.out.println("系统时间"+date);
        //查询出差信息时间，超过出差结束时间修改状态为已过期
        for (int i=0;i<list.size();i++){
            Staffbusiness s = list.get(i);
            System.out.println("数据库时间"+s.getEndTime());
            if (date.getTime()>s.getEndTime().getTime()&&s.getStaffbusinessState()==2){
                s.setStaffbusinessState(3);
                log.debug("员工请假已过期");
                log.debug("状态"+s.getStaffbusinessState());
            }
            mapper.updateById(s);
        }
        return list;
    }

    @Override
    public int upStaffbusiness(Staffbusiness staffbusiness) {
        Date date = new Date();
        if (date.getTime()>staffbusiness.getBeginTime().getTime()){
            staffbusiness.setBeginTime(date);
        }
        int update = mapper.updateById(staffbusiness);
        return update;
    }

    @Override
    public int delstaffbusiness(int bid) {
        Staffbusiness business = mapper.selectById(bid);
        business.setDeleted(1);
        int del = mapper.updateById(business);
        return del;
    }
}
