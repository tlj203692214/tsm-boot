package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Personal;
import com.tsm.service.IPersonalService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping("/findpersonals")
    public IPage<Personal> findpersonals(@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<Personal> iPage = service.findPersonals(it, page, size);
        log.debug(iPage.toString());
        return iPage;
    }
    @GetMapping("/selectpersonal")
    public List<Personal> SelPersonals(){
        List<Personal> list = service.findPersonals();
        log.debug(list.toString());
        return list;
    }
}
