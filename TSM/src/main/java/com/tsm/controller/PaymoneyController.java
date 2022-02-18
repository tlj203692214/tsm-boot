package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Paymoney;
import com.tsm.service.IPaymoneyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@Slf4j
@CrossOrigin(maxAge = 60)
@RequestMapping("/payMoney")
public class PaymoneyController {
    @Autowired
    private IPaymoneyService iPaymoneyService;

    //统计订单数
    @GetMapping("/paymoneyCount")
    public Long paymoneycount(){
        Long count = iPaymoneyService.PaymoneyCount(0);
        log.debug(count.toString());
        return count;
    }

    //统计总数
    @GetMapping("/paymoneysum")
    public Double paymoneysum(){
        Double sum = iPaymoneyService.PaymoneySum(0);
        log.debug(sum.toString());
        return sum;
    }

    /**
     * 删除选中的数据
     */
    @PostMapping("/removeByIds")
    public int deletePayMoney(@RequestBody Paymoney paymoney){
      return iPaymoneyService.deleteByIds(paymoney.getPaymoneyId());
    }

    //添加缴费记录
    @PostMapping("/intopatmoney")
    public int intopayMoney(@RequestBody Paymoney paymoney){
        int a=iPaymoneyService.intoPaymone(paymoney);
        return a;
    }


}
