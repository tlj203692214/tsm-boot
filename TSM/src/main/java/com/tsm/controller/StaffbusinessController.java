package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Staffbusiness;
import com.tsm.service.IStaffbusinessService;
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
@RequestMapping("/staffbusiness")
public class StaffbusinessController {
    @Autowired
    private IStaffbusinessService service;
    @GetMapping("/business")
    public IPage<Staffbusiness> findbusiness(@RequestParam("select") String st, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<Staffbusiness> iPage = service.findbusiness(st, page, size);
        log.debug(iPage.toString());
        return iPage;
    }
}
