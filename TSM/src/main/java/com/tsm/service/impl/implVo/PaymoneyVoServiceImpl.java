package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.PaymoneyVoMapper;
import com.tsm.service.serviceVo.PaymoneyVoService;
import com.tsm.vo.ExpenditureVo;
import com.tsm.vo.payMoneyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class PaymoneyVoServiceImpl extends ServiceImpl<PaymoneyVoMapper, payMoneyVo> implements PaymoneyVoService {
    @Autowired
    private PaymoneyVoMapper paymoneyVoMapper;

    /**
     * 财务：报班缴费模糊查询
     */
    @Override
    public IPage<payMoneyVo> selectPayMoney(int page, int pageInfo, String stuname, String payName, int state) {
        Page<payMoneyVo> page1 = new Page<>(page, pageInfo);
        QueryWrapper<payMoneyVo> queryWrapper = new QueryWrapper<>();

        queryWrapper.like("st.STUDENTFILES_NAME", stuname)
                .eq("p.DELETED", 0);
        if (payName.equals("全部支付")) {
        } else {
            queryWrapper.eq("p.PAYMONEY_MODE", payName);
        }

        if (state == 2) {
        } else if (state == 0) {
            queryWrapper.eq("p.PAYMONEY_STATE", state);
        } else if (state == 1) {
            queryWrapper.eq("p.PAYMONEY_STATE", state);
        }
        IPage<payMoneyVo> payMoneyVoIPage = paymoneyVoMapper.selectPayMoneyVo(page1, queryWrapper);

        return payMoneyVoIPage;
    }

    /**
     * 统计总金额
     *
     * @return
     */
    @Override
    public double countMoney() {
        List<payMoneyVo> list = paymoneyVoMapper.selectAllMoney();
        int a = paymoneyVoMapper.countMoney();
        double money = 0;
        for (int i = 0; i < a; i++) {
            money = money + list.get(i).getPaymoneyMoney();
        }
        return money;
    }

    /**
     * 根据状态查询金额
     *
     * @return
     */
    @Override
    public double countMoneyByState() {
        List<payMoneyVo> list = paymoneyVoMapper.selectAllByState();
        int a = paymoneyVoMapper.countMoneyByState();
        double money = 0;
        for (int i = 0; i < a; i++) {
            money = money + list.get(i).getPaymoneyMoney();
        }
        return money;
    }

    @Override
    public double countMoneyByState2() {
        List<payMoneyVo> list = paymoneyVoMapper.selectAllByState2();
        int a = paymoneyVoMapper.countMoneyByState2();
        double money = 0;
        for (int i = 0; i < a; i++) {
            money = money + list.get(i).getPaymoneyMoney();
        }
        return money;
    }


}
