package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Refund;
import com.tsm.mapper.RefundMapper;
import com.tsm.mapper.voMapper.RefundVoMapper;
import com.tsm.service.IRefundService;
import com.tsm.service.serviceVo.IRefundVoService;
import com.tsm.vo.RefundVo;
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
public class RefundVoServiceImpl extends ServiceImpl<RefundVoMapper, RefundVo> implements IRefundVoService {
    @Autowired
    private RefundVoMapper refundVoMapper;

    @Override
    public IPage<RefundVo> selectRefundVoAll(int page, int size) {
        Page<RefundVo> page1 = new Page<>(page,size);
        IPage<RefundVo> refundVoIPage = refundVoMapper.selectRefundVoAll(page1, null);
        return refundVoIPage;
    }
}
