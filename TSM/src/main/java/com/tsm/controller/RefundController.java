package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Refund;
import com.tsm.service.IRefundService;
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
public class RefundController {

    @Autowired
    private IRefundService iRefundService;

    @GetMapping("/selectRefund")
    public IPage<Refund> selectRefund(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo){
        IPage<Refund> refundPage = iRefundService.selectRefund(page, pageInfo);
        return refundPage;
    }

}
