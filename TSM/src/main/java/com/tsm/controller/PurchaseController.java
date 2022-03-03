package com.tsm.controller;


import com.tsm.entity.Purchase;
import com.tsm.service.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

@PostMapping("/updatepur")
    public int updatepur(@RequestBody Purchase purchase){
    int a=service.updatepur(purchase);
    return a;
}
@GetMapping("/selectlist")
    public List<Purchase> selectlist(){
    List<Purchase> list=service.selectlist();
    return list;
}

//修改数量
    @PostMapping("/updatepursl")
    public int updatepursl(@RequestBody Purchase purchase){
    int a=service.updateputsl(purchase);
    return a;
    }
}
