package com.tsm.controller.controllerVo;

import com.tsm.service.serviceVo.PositionNavVoService;
import com.tsm.vo.positionNavVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/positionNav")
@CrossOrigin(maxAge = 60)
public class PositionNavVoController {
    @Autowired
    private PositionNavVoService positionNavService;

    //    根据角色id查询权限
    @PostMapping("/selectPosById")
    public int[] selectPosById(@RequestBody positionNavVo positionNavVo) {
        return positionNavService.selectPosById(positionNavVo.getPositionId());
    }
}
