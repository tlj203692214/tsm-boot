package com.tsm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.tsm.entity.Receiving;
import com.tsm.mapper.ReceivingMapper;
import com.tsm.service.IReceivingService;
import lombok.extern.slf4j.Slf4j;
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
@RequestMapping("/receiving")
public class ReceivingController {
    @Autowired
    private ReceivingMapper receivingMapper;
    @Autowired
    private IReceivingService iReceivingService;

    @PostMapping("/addreceiving")
    public int addreceiving(@RequestBody Receiving receiving){
        System.out.println("ssssssssssssssssssbbbbbbbbbbbbbbbbbbbbb");
        int a = iReceivingService.addreceiving(receiving);

        return a;
    }
    @GetMapping("/receiving")
    public IPage<Receiving> findAllreceiving(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("StaffNames") String name, @RequestParam("zt") String zt, @RequestParam("js") String js, @RequestParam("input") String input) {
//        QueryWrapper<Receiving> wrapper=new QueryWrapper<>();
//        wrapper.inSql("STAFF_NAME2", "select STAFF_NAME2 from RECEIVING where STAFF_NAME2 like '%" + name + "%'");
////                .notLike("RECEIVING_DELETED",name)
//        if(zt.equals("a")){
//
//        }else if(zt.equals("b")){
//            wrapper.like("RECEIVINGS_STATE",name);
//        }else {
//            wrapper.notLike("RECEIVINGS_STATE",name);
//        }
//        if(js.equals("bt")){
//            wrapper .inSql("RECEIVINGS_TITLE", "select RECEIVINGS_TITLE from RECEIVING where RECEIVINGS_TITLE like '%" +input+ "%'");
//        }else {
//            wrapper.inSql("STAFF_NAME1", "select STAFF_NAME1 from RECEIVING where STAFF_NAME1 like '%" +input+ "%'");
//        }
//        Page<Receiving> page1=new Page<>(page,size);
//        IPage<Receiving> sendIPage = receivingMapper.selectPage(page1, wrapper);
        IPage<Receiving> sendIPage =iReceivingService.findAllreceiving(page, size, name, zt, js, input);
        return  sendIPage;



    }
    @PostMapping("/delectreceiving")
    public int delectreceiving(@RequestBody Receiving receiving) {


        Integer result=iReceivingService.delectsends(receiving);
        return result;

    }
    @PostMapping("/xgreceiving")
    public int xgreceiving(@RequestBody Receiving receiving){

        Integer result = iReceivingService.xgreceiving(receiving);
        return result;




    }
}
