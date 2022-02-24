package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IPurchaseVoService;
import com.tsm.vo.PurchaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(maxAge = 60)
public class PurchaseVoController {
    @Autowired
    private IPurchaseVoService service;

    @GetMapping("/selectpurchase")
    public IPage<PurchaseVo> selectpurchase(@RequestParam("currentPage") int page,@RequestParam("size") int size){
       IPage<PurchaseVo> iPage=service.selectPurchase(page, size);
       return iPage;
    }

    @GetMapping("/selectmhpurchase")
    public IPage<PurchaseVo> selectmhpurchase(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("name") String name,@RequestParam("jcmc") String jcmc){
        IPage<PurchaseVo> iPage=service.selectmhPurchase(page, size, name, jcmc);
        return iPage;
    }
}
