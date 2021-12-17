package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Paymoney;
import com.tsm.mapper.PaymoneyMapper;
import com.tsm.service.IPaymoneyService;
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
public class PaymoneyController {
    @Autowired
    private IPaymoneyService iPaymoneyService;

    /*
     * 财务分页查询
     */
    @GetMapping("/selectPayMoney")
    public IPage<Paymoney> selectPayMoney(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo){
        IPage<Paymoney> paymoneyPage = iPaymoneyService.selectPayMoney(page, pageInfo);
        return paymoneyPage;
    }
}
