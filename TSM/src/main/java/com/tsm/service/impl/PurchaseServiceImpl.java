package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Purchase;
import com.tsm.mapper.PurchaseMapper;
import com.tsm.service.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
