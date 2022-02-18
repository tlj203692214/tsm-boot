package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.GraduationVoService;
import com.tsm.vo.GraduationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(maxAge = 60)
public class GraduationVoController {
    @Autowired
    private GraduationVoService service;

    //分页查询
    @GetMapping("selectGraduation")
    public IPage<GraduationVo> iPage(@RequestParam("currentPageOne") int page,@RequestParam("sizeOne") int size){
        IPage iPage=service.fyselect(page, size);
        return iPage;
    }
    //模糊查询
    @GetMapping("/mohuselect")
    public IPage<GraduationVo> mohuselect(@RequestParam("currentPageOne") int page,@RequestParam("sizeOne") int size,@RequestParam("xsname") String xsxm,@RequestParam("bj") String bj){
        IPage<GraduationVo> iPage=service.mohuselect(page, size, xsxm, bj);
        return iPage;
    }
    //模糊查询
    @GetMapping("/moselect")
    public IPage<GraduationVo> moselect(@RequestParam("currentPageOne") int page,@RequestParam("sizeOne") int size,@RequestParam("xsname") String xsxm,@RequestParam("bj") String bj){
        IPage<GraduationVo> iPage=service.moselect(page, size, xsxm, bj);
        return iPage;
    }
}
