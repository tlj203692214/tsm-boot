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

    @Override
    public int updateState(int id) {
        Refund refund = refundMapper.selectById(id);
        refund.setRefundState(0);
        int i = refundMapper.updateById(refund);
        return i;
    }

    @Override
    public int deleteById(int id) {
        Refund refund = refundMapper.selectById(id);
        refund.setDeleted(1);
        int i = refundMapper.deleteById(refund);
        return i;
    }

    @Override
    public int udatezt(Refund refund) {
        int a=refundMapper.updatezt(refund);
        return a;
    }

    @Override
    public int addrefund(Refund refund) {
        int a=refundMapper.insert(refund);
        return a;
    }


}
