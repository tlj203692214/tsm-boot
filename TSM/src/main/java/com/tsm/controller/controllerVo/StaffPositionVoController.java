package com.tsm.controller.controllerVo;

import com.tsm.service.serviceVo.StaffPositionService;
import com.tsm.service.serviceVo.StaffVoService;
import com.tsm.vo.StaffPositionVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
public class StaffPositionVoController {
    @Autowired
    private StaffPositionService staffPositionService;

    @GetMapping("selectstall")
    public List<StaffPositionVo> selectsta(){
        List<StaffPositionVo> staffPositionVos=staffPositionService.selectlist();
        return staffPositionVos;
    }

    @GetMapping("selectjwk")
    public List<StaffPositionVo> selectjwk(){
        List<StaffPositionVo> staffPositionVos=staffPositionService.selectjwk();
        return staffPositionVos;
    }
}
