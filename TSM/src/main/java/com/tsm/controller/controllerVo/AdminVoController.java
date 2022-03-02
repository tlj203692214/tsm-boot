package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;

import com.tsm.service.serviceVo.IAdminVoService;
import com.tsm.vo.AdminVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class AdminVoController {
    @Autowired
    private IAdminVoService voService;
    @GetMapping("/findsadminvo")
    public IPage<AdminVo> findsAdminVo(@RequestParam("radio") String ri,@RequestParam("select") String st,@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<AdminVo> iPage = voService.findsadmins(ri, st, it, page, size);
        log.debug(iPage.toString());
        return iPage;
    }

    @GetMapping("/admins/{aid}")
    public AdminVo adminVo(@PathVariable("aid") int aid){
        AdminVo adminVo = voService.admins(aid);
        log.debug("员工详情"+adminVo.toString());
        return adminVo;
    }
}
