package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Refund;
import com.tsm.mapper.RefundMapper;
import com.tsm.service.IRefundService;
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
public class RefundServiceImpl extends ServiceImpl<RefundMapper, Refund> implements IRefundService {
    @Autowired
    private RefundMapper refundMapper;


    @Override
    public IPage<Refund> selectRefund(int page, int size) {
        Page<Refund> page1 = new Page<>(page,size);
        return refundMapper.selectPage(page1,null);
    }

    @Override
    public Refund selectAllById(int id) {
        return refundMapper.selectById(id);
    }


}
