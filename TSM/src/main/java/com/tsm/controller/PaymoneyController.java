package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Paymoney;
import com.tsm.service.IPaymoneyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Slf4j
@RestController
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
}
