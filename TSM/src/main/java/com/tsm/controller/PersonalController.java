package com.tsm.controller;


import com.tsm.entity.Personal;
import com.tsm.service.IPersonalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
@RequestMapping("/personal")
public class PersonalController {
    @Autowired
    private IPersonalService service;
    @PostMapping("/addpersonal")
    public int addpersonal(@RequestBody Personal personal){
        int add = service.addpersonal(personal);
        System.out.println("新增数据"+add+"条");
        return add;
    }

    /**
     * 修改用户
     */
    @PostMapping("/updatePersonal")
    public int updatePersonal(@RequestBody Personal personal){
        return service.updatePersonal(personal);
    }

}
