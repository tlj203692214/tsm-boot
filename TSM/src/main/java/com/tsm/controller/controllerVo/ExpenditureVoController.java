package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.IExpenditureService;
import com.tsm.service.serviceVo.IExpenditureVoService;
import com.tsm.vo.ExpenditureVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/expenditureVo")
public class ExpenditureVoController {
    @Autowired
    private IExpenditureVoService iExpenditureVoService;

    /**
     * 查询校务支出的数据
     *
     * @param page
     * @param pageInfo
     * @return
     */
    @GetMapping("/selectExpenditureVo")
    public IPage<ExpenditureVo> selectExpenditure(@RequestParam("currentPage") int page, @RequestParam("pagesize") int pageInfo) {

        IPage<ExpenditureVo> expenditureIPage = iExpenditureVoService.selectExpenditurePage(page, pageInfo);
        return expenditureIPage;
    }



    /**
     * 根据时间查询校务支出
     */
    @GetMapping("/selectExpendByDate")
    public IPage<ExpenditureVo> selectExpendByDate(@RequestParam("currentPage") int page, @RequestParam("pagesize") int pageInfo,
            @RequestParam("startTime") String startTime, @RequestParam("endTime") String endTime)throws Exception {
        IPage<ExpenditureVo> expenditureVoIPage = iExpenditureVoService.selectExpendByDate(page, pageInfo, startTime, endTime);
        return expenditureVoIPage;
    }
}
