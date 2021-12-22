package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IncomeVoService;
import com.tsm.vo.IncomeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/incomeVo")
public class IncomeVoController {
    @Autowired
    private IncomeVoService incomeVoService;

    @GetMapping("/selectIncomeVo")
    public IPage<IncomeVo> selectIncomVo(@RequestParam("currentPage")int page,@RequestParam("pagesize")int size){
        IPage<IncomeVo> incomeVoIPage = incomeVoService.selectIncomeVo(page, size);
        return incomeVoIPage;
    }
}
