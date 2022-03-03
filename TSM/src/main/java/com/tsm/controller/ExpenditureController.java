package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Expenditure;
import com.tsm.service.IExpenditureService;
import com.tsm.service.serviceVo.IExpenditureVoService;
import com.tsm.vo.ExpenditureVo;
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
@RequestMapping("/expenditure")
public class ExpenditureController {

    @Autowired
    private IExpenditureService expenditureService;
    //添加支出表
    @PostMapping("/interexpenditure")
    public int interexpenditure(@RequestBody Expenditure expenditure){
        int a=expenditureService.addexpenditure(expenditure);
        return a;
    }
    //修改支出表金额
    @PostMapping("/updateexpend")
    public int updateexpend(@RequestBody Expenditure expenditure){
        int a = expenditureService.updateexpend(expenditure);
        return a;
    }
    //退学添加支出
    @PostMapping("/addexpend")
    public int addexpend(@RequestBody Expenditure expenditure){
        int a=expenditureService.addexpend(expenditure);
        return a;
    }
}
