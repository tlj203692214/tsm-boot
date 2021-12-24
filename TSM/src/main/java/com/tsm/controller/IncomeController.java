package com.tsm.controller;


import com.tsm.entity.Income;
import com.tsm.service.IIncomeService;
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
@RequestMapping("/income")
public class IncomeController {
    @Autowired
    private IIncomeService incomeService;

    @PostMapping("/updateState")
    public int updateState(@RequestBody Income income){
        return incomeService.updateState(income.getIncomeId());
    }

    @GetMapping("/IncomeCount")
    public Long IncomeCount(){
        Long count = incomeService.IncomeCount(0);
        log.debug(count.toString());
        return count;
    }
}
