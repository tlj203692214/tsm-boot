package com.tsm.controller;


import com.tsm.entity.Purchase;
import com.tsm.service.IPurchaseService;
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
@RequestMapping("/purchase")
public class PurchaseController {
@Autowired
    private IPurchaseService service;

@PostMapping("/interpurchase")
    public int interpurchase(@RequestBody Purchase purchase){
    int a=service.interpur(purchase);
    return a;
}
}
