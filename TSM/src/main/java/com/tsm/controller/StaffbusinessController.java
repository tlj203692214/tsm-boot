package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Staffbusiness;
import com.tsm.service.IStaffbusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
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
    @PostMapping("/insertbusiness")
    public int Insertbusiness(@RequestBody Staffbusiness staffbusiness){
        int add = service.addstaffbusiness(staffbusiness);
        log.debug("新增成功"+add+"条数据");
        return add;
    }
    @GetMapping("/listbusiness")
    public List<Staffbusiness> listStaffleave(){
        List<Staffbusiness> list = service.listStaffbusiness();
        return list;
    }
    //员工出差审批
    @PostMapping("/upstaffbusiness")
    public int Upstaffbusiness(@RequestBody Staffbusiness staffbusiness){
        int update = service.upStaffbusiness(staffbusiness);
        if (update>0){
            log.debug("请假成功"+update);
        }else{
            log.debug("请假失败");
        }
        return update;
    }
    //员工过期出差删除
    @PostMapping("/delstaffbusiness/{sid}")
    public int delstaffbusiness(@PathVariable("sid") int bid){
        int del = service.delstaffbusiness(bid);
        if (del>0){
            log.debug("删除成功"+del);
        }else{
            log.debug("删除失败");
        }
        return del;
    }
}
