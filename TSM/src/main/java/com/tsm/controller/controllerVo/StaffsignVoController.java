package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IStaffsignVoService;
import com.tsm.vo.StaffsignVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class StaffsignVoController {
    @Autowired
    private IStaffsignVoService voService;
    //员工打卡分页查询
    @GetMapping("/Staffsignvo")
    public IPage<StaffsignVo> findStaffsignvo(@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<StaffsignVo> iPage = voService.findStaffsign(it,page,size);
        log.debug(iPage.toString());
        return iPage;
    }
}
