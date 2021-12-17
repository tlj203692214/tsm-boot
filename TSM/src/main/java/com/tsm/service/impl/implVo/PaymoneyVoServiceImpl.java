package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.PaymoneyVoMapper;
import com.tsm.service.serviceVo.PaymoneyVoService;
import com.tsm.vo.payMoneyVo;
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
public class PaymoneyVoServiceImpl extends ServiceImpl<PaymoneyVoMapper, payMoneyVo> implements PaymoneyVoService {
    @Autowired
    private PaymoneyVoMapper paymoneyVoMapper;

    //财务分页查询
    @Override
    public IPage<payMoneyVo> selectPayMoney(int page, int pageInfo) {
        Page<payMoneyVo> page1 = new Page<>(page,pageInfo);
        return paymoneyVoMapper.selectPayMoneyVoAll(page1,null);
    }
}
