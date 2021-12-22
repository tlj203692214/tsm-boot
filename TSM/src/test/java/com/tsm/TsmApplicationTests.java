package com.tsm;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Paymoney;
import com.tsm.entity.Refund;
import com.tsm.mapper.PaymoneyMapper;
import com.tsm.mapper.RefundMapper;
import com.tsm.mapper.voMapper.PaymoneyVoMapper;
import com.tsm.vo.RefundVo;
import com.tsm.vo.payMoneyVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TsmApplicationTests {
    @Autowired
    private PaymoneyVoMapper paymoneyVoMapper;
    @Autowired
    private PaymoneyMapper paymoneyMapper;
    @Autowired
    private RefundMapper refundMapper;

    @Test
    void contextLoads() {
//        Refund refund = refundMapper.selectById(4);
//        refund.setDeleted(1);
//        int i = refundMapper.deleteById(refund);
//        System.out.println("删除成功"+i);
    }

}
