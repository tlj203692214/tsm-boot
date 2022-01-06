package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.tsm.entity.Receiving;
import com.tsm.entity.Sendandreceiving;
import com.tsm.mapper.SendandreceivingMapper;
import com.tsm.service.ISendandreceivingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-14
 */
@Service
public class SendandreceivingServiceImpl extends ServiceImpl<SendandreceivingMapper, Sendandreceiving> implements ISendandreceivingService {
    @Autowired
    private  SendandreceivingMapper sendandreceivingMapper;

    @Override
    public int addsandr(Sendandreceiving sendandreceiving) {
        System.out.println(sendandreceiving.toString()+":shuju");
        int i=sendandreceivingMapper.insert(sendandreceiving);
        return i;

    }

    @Override
    public List<Sendandreceiving> findAllsandr(int id) {
        QueryWrapper<Sendandreceiving> wrapper=new QueryWrapper<>();
        wrapper.eq("SEND_ID",id);
        List<Sendandreceiving> list=sendandreceivingMapper.selectList(wrapper);
        return list;
    }

    @Override
    public int xgsandr(Sendandreceiving sendandreceiving) {
        QueryWrapper<Sendandreceiving>  wrapper=new QueryWrapper<>();
        int id= sendandreceiving.getSendId();
        String name=sendandreceiving.getStaffName2();
        System.out.println(id+"编号");
        System.out.println(name+"姓名");
  wrapper.eq("SEND_ID",id)
          .eq("STAFFNAME2",name);
       List<Sendandreceiving> list=sendandreceivingMapper.selectList(wrapper);

      Sendandreceiving sendandreceiving1=sendandreceivingMapper.selectById(list.get(0).getSandrId());
                 sendandreceiving1.setSandrState("已读");
              Integer integer=sendandreceivingMapper.updateById(sendandreceiving1);

        return integer;
    }
}
