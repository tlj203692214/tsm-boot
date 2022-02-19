package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.IClaVoService;
import com.tsm.vo.ClassesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 60)
public class ClassesVoController {
    @Autowired
    private IClaVoService service;

    @GetMapping("/ClassesVoService")
    public IPage<ClassesVo> selectclassesVO(@RequestParam("currentPage") int page,@RequestParam("size") int size){
        IPage<ClassesVo> page1=service.selectClassesVopage(page, size);
        return page1;
    }

    //模糊分页查询
    @GetMapping("/mohuselectClassVo")
    public IPage<ClassesVo> selectclassesVo(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("bjname") String bjname,@RequestParam("bzr") String bzr,@RequestParam("jsname") String jsname){
        IPage<ClassesVo> mohuselect=service.selectmhClassesVopage(page, size, bjname, bzr, jsname);
        return mohuselect;
    }

    //分页查询学生
    @GetMapping("/selectstudnet")
    public IPage<ClassesVo> selectstudent(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("id") String id){
        IPage<ClassesVo> iPage=service.selectStudent(page, size, id);
        return iPage;
    }

    //分页模糊查询
    @GetMapping("/selectlikestudent")
    public IPage<ClassesVo> selectlikestudent(@RequestParam("currentPage") int page,@RequestParam("size") int size){
        IPage<ClassesVo> iPage=service.selectmhstudent(page, size);
        return iPage;
    }

    //分页查询课表
    @GetMapping("/selectkebiao")
    public IPage<ClassesVo> selectkebioa(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("id") String id){
        IPage<ClassesVo> iPage=service.selectkebiao(page, size, id);
        return iPage;
    }
}
