package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.vo.FollowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.List;

@RestController
@CrossOrigin(maxAge = 60)
public class FollowVoController {
    @Autowired
    private FollowVoService followVoService;

    @GetMapping("selectfollowvo")
    public IPage<FollowVo> selectfollowvo(@RequestParam("currentPage") int page,@RequestParam("size") int size){
        IPage<FollowVo> page1=followVoService.selectfollowvo(page, size);
        return page1;
    }

    @GetMapping("/ssss")
    public IPage<FollowVo> selectfollowvomohu(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc) throws ParseException {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo(page, size, name, qkzt, lyqd, yxkc);
        return followVoIPage;
    }
    //新生报名模糊查询
    @GetMapping("/xsmh")
    public IPage<FollowVo> selectfollowvoxsmohu(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc,@RequestParam("xsbm") String sfbm) throws ParseException {
        IPage<FollowVo> followVoIPage=followVoService.selectxsmohufollowvo(page, size, name, qkzt, lyqd, yxkc,sfbm);
        return followVoIPage;
    }

    @GetMapping("/sssss")
    public IPage<FollowVo> selectfollowvomohu1(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc) {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo1(page, size, name, qkzt, lyqd, yxkc);
        return followVoIPage;
    }

    @GetMapping("/aaaa")
    public IPage<FollowVo> selectfollowvomohu2(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc) throws ParseException {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo2(page, size, name, qkzt, lyqd, yxkc);
        return followVoIPage;
    }
    @GetMapping("/bbbb")
    public IPage<FollowVo> selectfollowvomohu3(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc) {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo3(page, size, name, qkzt, lyqd, yxkc);
        return followVoIPage;
    }

    @GetMapping("/selectid/{id}")
    public List<FollowVo> selectid(@PathVariable(name = "id") String id){
        List<FollowVo> list=followVoService.selectList(id);
        return list;
    }
}
