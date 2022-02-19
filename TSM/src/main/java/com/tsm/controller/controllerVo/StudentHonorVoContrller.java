package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IStudentHonorVoService;
import com.tsm.service.serviceVo.StaffVoService;
import com.tsm.vo.StudentHonorVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class StudentHonorVoContrller {
    @Autowired
    private IStudentHonorVoService service;

    @GetMapping("selectStudentHonorVo")
    public IPage<StudentHonorVo> selectStudentHonorVo(@RequestParam("currentPage") int page, @RequestParam("size") int size,@RequestParam("studnetid") String id){
        IPage<StudentHonorVo> iPage=service.pagest(page, size, id);
        return iPage;
    }

    @GetMapping("/selectStudentTalk")
    public IPage<StudentHonorVo> selectStudentTalk(@RequestParam("currentPage") int page, @RequestParam("size") int size,@RequestParam("studnetid") String id) {
        IPage<StudentHonorVo> iPage=service.pageth(page, size, id);
        return iPage;
    }

    @GetMapping("/selectStudentPun")
    public IPage<StudentHonorVo> selectStudentPun(@RequestParam("currentPage") int page, @RequestParam("size") int size,@RequestParam("studnetid") String id) {
    IPage<StudentHonorVo> studentHonorVoIPage=service.pagecf(page, size, id);
    return studentHonorVoIPage;
    }
    }
