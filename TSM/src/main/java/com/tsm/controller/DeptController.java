package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Dept;
import com.tsm.service.IDeptService;
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
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private IDeptService service;
    @GetMapping("/depts")
    public IPage<Dept> findDepts(@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("tid") int tid){
        IPage<Dept> iPage = service.findDepts(it, page, size, tid);
        log.debug(iPage.toString());
        return iPage;
    }

    @PostMapping("/selectDept")  //查询所有部门
    public List<Dept> selectDept(@RequestBody Dept dept){
        List<Dept> list=service.updateDept(dept);
        return list;
    }
    //逻辑删除部门
    @PostMapping("/deldept/{deptid}")
    public int deldept(@PathVariable("deptid") int deptid){
        int del = service.delDept(deptid);
        return del;
    }

    @PostMapping("/updept")
    public int updept(@RequestBody Dept dept){
        int updete = service.upDept(dept);
        return updete;
    }

    @PostMapping("/addDept")
    public int addDept(@RequestBody Dept dept){
        int insert = service.addDept(dept);
        return insert;
    }

    @GetMapping("/listDept")
    public List<Dept> ListDept(){
        List<Dept> list = service.ListDept();
        return list;
    }
    @PostMapping("/selectDepts/{staffId}")   //通过员工id查询部门
    public List<Dept> selectDepts(@PathVariable("staffId") int id){
   List<Dept> list = service.selectDept(id);
        return list;
    }
    @PostMapping("/selectDeptjl/{staffId}")   //查询多级部门
    public List<Dept> selectDeptjl(@PathVariable("staffId") int id){
            List<Dept> list=service.selectDeptlj(id);
        return list;
    }
}
