package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.TimeTableVoService;
import com.tsm.vo.TimeTableVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 60)
public class TimeTableVoImplController {
    @Autowired
    private TimeTableVoService service;

    @GetMapping("/selectteaching")
    public IPage<TimeTableVo> selectteaching(@RequestParam("currentPage")int page,@RequestParam("size")int size,@RequestParam("name")String name){
            IPage<TimeTableVo> iPage=service.selectTimeTableVo(page, size, name);
            return iPage;
    }

    @GetMapping("/selectlist")
    public List<TimeTableVo> selectlist(){
        List<TimeTableVo> iPage=service.selectlist();
        return iPage;
    }
}
