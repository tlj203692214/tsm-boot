package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Paymoney;
import com.tsm.mapper.PaymoneyMapper;
import com.tsm.service.IPaymoneyService;
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
public class PaymoneyServiceImpl extends ServiceImpl<PaymoneyMapper, Paymoney> implements IPaymoneyService {
    @Autowired
    private PaymoneyMapper paymoneyMapper;

    //财务分页查询
    @Override
    public IPage<Paymoney> selectPayMoney(int page, int pageInfo) {
        Page<Paymoney> page1 = new Page<>(page,pageInfo);
        return paymoneyMapper.selectPage(page1,null);
    }
}
