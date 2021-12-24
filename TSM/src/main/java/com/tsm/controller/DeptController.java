package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Dept;
import com.tsm.service.IDeptService;
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
public class DeptController {
    @Autowired
    private IDeptService service;
    @GetMapping("/depts")
    public IPage<Dept> findDepts(@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<Dept> iPage = service.findDepts(it, page, size);
        log.debug(iPage.toString());
        return iPage;
    }
}
