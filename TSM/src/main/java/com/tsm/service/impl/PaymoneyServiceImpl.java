package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Paymoney;
import com.tsm.mapper.PaymoneyMapper;
import com.tsm.service.IPaymoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
public class PaymoneyServiceImpl extends ServiceImpl<PaymoneyMapper, Paymoney> implements IPaymoneyService {
    @Autowired
    private PaymoneyMapper paymoneyMapper;


    @Override
    public int deletePayMoney(int id) {
        Paymoney paymoney = paymoneyMapper.selectById(id);
        paymoney.setDeleted(1);
        int i = paymoneyMapper.deleteById(paymoney);
        return i;
    }

    @Override
    public Long PaymoneyCount(int zt) {
        QueryWrapper<Paymoney> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",zt);
        Long count = paymoneyMapper.selectCount(wrapper);
        return count;
    }

    @Override
    public double PaymoneySum(int zt) {
        QueryWrapper<Paymoney> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",zt);
        Long count = paymoneyMapper.selectCount(wrapper);
        List<Paymoney> list =paymoneyMapper.selectList(wrapper);
        double a = 0l;
        for(int i=0;i<count;i++){
            a=a+list.get(i).getPaymoneyMoney();
        }
        return a;
    }
}
