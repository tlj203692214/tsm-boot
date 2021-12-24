package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;

import com.tsm.service.serviceVo.IAdminVoService;
import com.tsm.vo.AdminVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class AdminVoController {
    @Autowired
    private IAdminVoService voService;
    @GetMapping("/findsadminvo")
    public IPage<AdminVo> findsAdminVo(@RequestParam("select") String st,@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<AdminVo> iPage = voService.findsadmins(st, it, page, size);
        log.debug(iPage.toString());
        return iPage;
    }
}
