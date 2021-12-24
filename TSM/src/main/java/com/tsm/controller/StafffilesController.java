package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Stafffiles;
import com.tsm.service.IStafffilesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
@RequestMapping("/stafffiles")
public class StafffilesController {
    @Autowired
    public IStafffilesService service;
    //学员档案分页模糊查询
    @GetMapping("/stafffs")
    public IPage<Stafffiles> findStafffs(@RequestParam("select") String st,@RequestParam("input") String it,@RequestParam("currentPage") int page, @RequestParam("pagesize") int size){
        IPage<Stafffiles> IPage = service.findStafffs(st,it,page,size);
        log.debug(IPage.toString());
        return IPage;
    }
}
