package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Student;
import com.tsm.service.serviceVo.StudentVoService;
import com.tsm.vo.StudnetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(maxAge = 60)
public class StudentVoController {
    @Autowired
    private StudentVoService service;
    //分页查询
    @GetMapping("/studentfy")
    public IPage<StudnetVo> studentIPage(@RequestParam("currentPage") int page, @RequestParam("size") int size){
        IPage<StudnetVo> studentIPage=service.cxstudentfy(page, size);
        return studentIPage;
    }

    //模糊分页查询
    @GetMapping("/mohustudent")
    public IPage<StudnetVo> studentIPage(@RequestParam("currentPage") int page, @RequestParam("size") int size,@RequestParam("xsname") String xsname,@RequestParam("bj") String bj,@RequestParam("sffb") Boolean sffb,@RequestParam("values") String values){
        IPage<StudnetVo> iPage=service.mohustudent(page, size, xsname, bj, sffb,values);
        return iPage;
    }

}
