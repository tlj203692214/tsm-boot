package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.LeacschoolVoService;
import com.tsm.vo.LeaceschoolVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class LeacschoolVoController {
    @Autowired
    private LeacschoolVoService service;

    @GetMapping("/selectpage")
    public IPage<LeaceschoolVo> selectpage(@RequestParam("page") int page,@RequestParam("size") int size,@RequestParam("name") String name){
        IPage<LeaceschoolVo> iPage=service.seleceipage(page, size, name);
        return iPage;
    }
}
