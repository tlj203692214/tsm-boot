package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IRefundVoService;
import com.tsm.vo.RefundVo;
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
public class RefundVoController {

    @Autowired
    private IRefundVoService iRefundVoService;

    @GetMapping("/selectRefundVoAll")
    public IPage<RefundVo> selectRefund(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo){
        IPage<RefundVo> refundPage = iRefundVoService.selectRefundVoAll(page, pageInfo);
        return refundPage;
    }

}
