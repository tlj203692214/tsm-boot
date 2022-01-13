package com.tsm.controller.controllerVo;


import com.tsm.service.serviceVo.IPersonalVoService;
import com.tsm.vo.personalVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@CrossOrigin(maxAge = 60)
@RequestMapping("/personalVo")
public class PersonalVoController {
    @Autowired
    private IPersonalVoService personalVoService;

    @GetMapping("/selectById/{id}")
    public personalVo selectById(@PathVariable("id") int id){
        System.out.println(id+"编号");
        return personalVoService.selectPicture(id);
    }
    @GetMapping("/selectPersonal/{staffId}")
    public List<personalVo> selectPersonalVo(@PathVariable("staffId") int id){
        System.out.println(id+"编号");
        return personalVoService.selectPersonal(id);
    }
}
