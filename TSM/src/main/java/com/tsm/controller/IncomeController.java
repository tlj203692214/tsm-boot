package com.tsm.controller;


import com.tsm.entity.Income;
import com.tsm.service.IIncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    private IIncomeService incomeService;

    @PostMapping("/updateState")
    public int updateState(@RequestBody Income income){
        return incomeService.updateState(income.getIncomeId());
    }
}
