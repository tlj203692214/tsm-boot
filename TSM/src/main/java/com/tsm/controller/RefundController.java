package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Refund;
import com.tsm.service.IRefundService;
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
@CrossOrigin(maxAge = 60)
@RequestMapping("/refund")
public class RefundController {

    @Autowired
    private IRefundService iRefundService;

    @GetMapping("/selectRefund")
    public IPage<Refund> selectRefund(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo){
        IPage<Refund> refundPage = iRefundService.selectRefund(page, pageInfo);
        return refundPage;
    }

    /**
     * 修改审核状态
     */
    @PostMapping("/updateState")
    public int updateState(@RequestBody Refund refund){
        System.out.println(refund);
        return iRefundService.updateState(refund.getRefundId());
    }

    /**
     * 删除选中的一行
     */
    @PostMapping("/deleteRefund")
    public int deleteRefund(@RequestBody Refund refund){
        return iRefundService.deleteById(refund.getRefundId());
    }

}
