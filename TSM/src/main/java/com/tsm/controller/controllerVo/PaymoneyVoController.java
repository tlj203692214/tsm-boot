package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.PaymoneyVoService;
import com.tsm.vo.payMoneyVo;
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
@RestController
@CrossOrigin(maxAge = 60)
@RequestMapping("/payMoneyVo")
public class PaymoneyVoController {
    @Autowired
    private PaymoneyVoService paymoneyVoService;

    /**
     * 财务：报班缴费模糊查询
     */
    @GetMapping("/selectPayMoneyVo")
    public IPage<payMoneyVo> selectPayMoney(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo,
        @RequestParam("stuname") String stuname,@RequestParam("pay") String pay,@RequestParam("payState")int state){
        IPage<payMoneyVo> paymoneyPage = paymoneyVoService.selectPayMoney(page, pageInfo,stuname,pay,state);
        return paymoneyPage;
    }

    /*
     * 财务统计金额
     */
    @GetMapping("/countAllMoney")
    public double countMoney(){
        return paymoneyVoService.countMoney();
    }

    /**
     * 根据状态统计到账的金额
     */
    @GetMapping("/countMoneyByState")
    public double countMoneyByState(){
        return paymoneyVoService.countMoneyByState();
    }

    /**
     * 根据状态统计未到账金额
     */
    @GetMapping("/countMoneyByState2")
    public double countMoneyByState2(){
        return paymoneyVoService.countMoneyByState2();
    }
}
