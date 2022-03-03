package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Purchase;
import com.tsm.mapper.PurchaseMapper;
import com.tsm.service.IPurchaseService;
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
public class PurchaseServiceImpl extends ServiceImpl<PurchaseMapper, Purchase> implements IPurchaseService {
    @Autowired
    private PurchaseMapper mapper;

    @Override
    public int interpur(Purchase purchase) {
        int a=mapper.insert(purchase);
        return (purchase.getPurchaseId());
    }

    @Override
    public int updatepur(Purchase purchase) {
        int a=mapper.updateById(purchase);
        return a;
    }

    @Override
    public List<Purchase> selectlist() {
        QueryWrapper<Purchase> wrapper=new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        List<Purchase> list=mapper.selectList(wrapper);
        return list;
    }

    @Override
    public int updateputsl(Purchase purchase) {
        int a=mapper.updatapursl(purchase,purchase.getPurchaseNumber(),purchase.getPurchaseId());
        return a;
    }


}
