package com.tsm.controller;
import com.tsm.entity.Sendandreceiving;
import com.tsm.service.ISendandreceivingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-14
 */
@Slf4j
@RestController
@CrossOrigin(maxAge = 60)//跨域
@RequestMapping("/sendAndReceiving")
public class SendandreceivingController {
    @Autowired
    private ISendandreceivingService iSendandreceivingService;
    @PostMapping("/addsandr")
    public int addsandr(@RequestBody Sendandreceiving sendandreceiving){

        int a = iSendandreceivingService.addsandr(sendandreceiving);

        return a;
    }
    @PostMapping("/findsandr/{id}")
    public List<Sendandreceiving> finsandr(@PathVariable("id") long id){

   List<Sendandreceiving> list=iSendandreceivingService.findAllsandr(id);

        return list;
    }
    @PostMapping("/xgsandr")
    public int xgsandr(@RequestBody Sendandreceiving sendandreceiving){

        Integer result = iSendandreceivingService.xgsandr(sendandreceiving);
        return result;




    }
}
