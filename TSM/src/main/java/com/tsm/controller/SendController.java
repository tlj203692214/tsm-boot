package com.tsm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Send;
import com.tsm.mapper.SendMapper;
import com.tsm.service.ISendService;
import lombok.extern.slf4j.Slf4j;
import org.apache.coyote.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.cassandra.CassandraProperties;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/send")
@CrossOrigin(maxAge = 60)
public class SendController {
    @Autowired
    private ISendService isendService;
    @PostMapping("/addsend")
    public Send addsend(@RequestBody Send send){

        Send send1=isendService.addsend(send);
        return send1;
    }
    @GetMapping("/Send")
    public IPage<Send> findAllSend(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("StaffNames") String name, @RequestParam("js") String js, @RequestParam("input") String input) {

        IPage<Send> sendIPage =isendService.findAllSend(page, size, name, js, input);
        return sendIPage;
    }
    @PostMapping("/delectsend")
    public int delectsends(@RequestBody Send send) {
        System.out.println(send.getSendId()+"编号id");
        Integer result=isendService.delectSend(send);
        return result;

    }
}
