package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Satffsign;
import com.tsm.mapper.SatffsignMapper;
import com.tsm.service.ISatffsignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
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
public class SatffsignServiceImpl extends ServiceImpl<SatffsignMapper, Satffsign> implements ISatffsignService {

    @Autowired
    private SatffsignMapper mapper;

    @Override
    @Transactional
    public int updateStaffsign(Satffsign satffsign) {
        int id = satffsign.getStaffId();
        int state = satffsign.getSignState();
        Satffsign s1=mapper.selectById(id);
        System.out.println("iddiididididi"+id);
        if (state==0){
            s1.setSignState(1);
            s1.setSignDate(new Date());
        }else if(state==1){
            s1.setSignState(2);
            s1.setSignDate(new Date());
        }
        int update = mapper.updateById(s1);
        if (update>0){
            System.out.println("打卡成功！");
        }else {
            System.out.println("打卡失败！");
        }
        return update;
    }

    @Override
    public List<Satffsign> StaffsignList() {
        QueryWrapper<Satffsign> wrapper = new QueryWrapper<>();
        List<Satffsign> list = mapper.selectList(wrapper);
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateInstance();
        String nyr = dateFormat.format(date);
        System.out.println("系统时间"+nyr);
        //查询员工打卡时间，如果与当前时间不符自动修改状态为未打卡
        for (int i=0;i<list.size();i++){
            Satffsign s=list.get(i);
            String mydate = dateFormat.format(s.getSignDate());
            System.out.println("数据库时间"+mydate);
            if (mydate.equals(nyr)){

            }else{
                s.setSignState(0);
                System.out.println("状态"+s.getSignState());
            }
            mapper.updateById(s);
        }
        return list;
    }

    @Override
    public int addStaffsign(Satffsign satffsign) {
        int add = mapper.insert(satffsign);
        return add;
    }

    @Override
    public Long StaffSignCount() {
        QueryWrapper<Satffsign> wrapper = new QueryWrapper<>();
        wrapper.notLike("SIGN_STATE",0);
        long count = mapper.selectCount(wrapper);
        return count;
    }
}
