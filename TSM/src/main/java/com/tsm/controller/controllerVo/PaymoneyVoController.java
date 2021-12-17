package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.PaymoneyVoService;
import com.tsm.vo.payMoneyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(maxAge = 60)
public class PaymoneyVoController {
    @Autowired
    private PaymoneyVoService paymoneyVoService;

    /*
     * 财务分页查询
     */
    @GetMapping("/selectPayMoneyVo")
    public IPage<payMoneyVo> selectPayMoney(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo){
        IPage<payMoneyVo> paymoneyPage = paymoneyVoService.selectPayMoney(page, pageInfo);
        return paymoneyPage;
    }
}
