package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IRefundVoService;
import com.tsm.vo.RefundVo;
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
@RequestMapping("/refundVo")
public class RefundVoController {

    @Autowired
    private IRefundVoService iRefundVoService;

    /**
     * 查询退费管理信息
     * @param page
     * @param pageInfo
     * @param name
     * @param state
     * @return
     */
    @GetMapping("/selectRefundVoAll")
    public IPage<RefundVo> selectRefund(@RequestParam("currentPage")int page, @RequestParam("pagesize") int pageInfo,@RequestParam("stuname") String name,@RequestParam("state") int state){
        IPage<RefundVo> refundPage = iRefundVoService.selectRefundVoAll(page, pageInfo,name,state);
        return refundPage;
    }

    /**
     * 根据id修改审批状态
     */
    @PostMapping("/updateState")
    public int updateState(@RequestBody RefundVo refundVo){
        return iRefundVoService.updateState(refundVo.getRefundId());
    }

}
