package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Expenditure;
import com.tsm.service.IExpenditureService;
import com.tsm.service.serviceVo.IExpenditureVoService;
import com.tsm.vo.ExpenditureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/expenditure")
public class ExpenditureController {

    @Autowired
    private IExpenditureService expenditureService;

//    @PostMapping("/interexpenditure")
//    public int interexpenditure(@RequestBody Expenditure expenditure){
//        int a=expenditureService.addexpenditure(expenditure);
//        return a;
//    }
    /**
     * 查询最小的支出时间
     */
    @GetMapping("selectMinDate")
    public Date selectMinDate(){
        return expenditureService.selectMinDate();
    }

//    校务支出退费添加
    @PostMapping("/insertExpenditureByRefund")
    public int insertExpenditureForRefund(@RequestBody Expenditure expenditure){
        System.out.println(expenditure+"退费数据");
        return expenditureService.insertExpendForRefund(expenditure);
    }

}
