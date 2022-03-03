package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IStaffleaveVoService;
import com.tsm.vo.StaffleaveVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class StaffleaveVoController {
    @Autowired
    private IStaffleaveVoService voService;
    //员工请假模糊分页查询
    @GetMapping("/staffleavesvo")
    public IPage<StaffleaveVo> findStaffleavevo(@RequestParam("select") String st, @RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<StaffleaveVo> iPage = voService.findleaveVo(st, it, page, size);
        log.debug(iPage.toString());
        return iPage;
    }
    //当前时间超过员工请假结束时间修改状态为正常
    @GetMapping("/Upstateleavevo")
    public List<StaffleaveVo> staffleaveVoList(){
        List<StaffleaveVo> list = voService.listStaffleaveVo();
        return list;
    }
}
