package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.IExpenditureService;
import com.tsm.service.serviceVo.IExpenditureVoService;
import com.tsm.vo.ExpenditureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
public class ExpenditureController {

    @Autowired
    private IExpenditureService expenditureService;


    @Autowired
    private IExpenditureVoService iExpenditureVoService;

    @GetMapping("selectExpenditure")
    public IPage<ExpenditureVo> selectExpenditure(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo){
        IPage<ExpenditureVo> expenditureIPage = iExpenditureVoService.selectExpenditurePage(page, pageInfo);
        return expenditureIPage;
    }


}
