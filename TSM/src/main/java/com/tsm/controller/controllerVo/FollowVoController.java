package com.tsm.controller.controllerVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.vo.FollowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

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
    public IPage<FollowVo> selectfollowvomohu(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc,@RequestParam("gjr") String gjr,@RequestParam("sj1") String sj1,@RequestParam("sj2") String sj2) throws ParseException {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo(page, size, name, qkzt, lyqd, yxkc, gjr,sj1,sj2);
        return followVoIPage;
    }
    @GetMapping("/sssss")
    public IPage<FollowVo> selectfollowvomohu1(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc,@RequestParam("gjr") String gjr) {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo1(page, size, name, qkzt, lyqd, yxkc, gjr);
        return followVoIPage;
    }

    @GetMapping("/aaaa")
    public IPage<FollowVo> selectfollowvomohu2(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc,@RequestParam("gjr") String gjr,@RequestParam("sj1") String sj1,@RequestParam("sj2") String sj2) throws ParseException {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo2(page, size, name, qkzt, lyqd, yxkc, gjr,sj1,sj2);
        return followVoIPage;
    }
    @GetMapping("/bbbb")
    public IPage<FollowVo> selectfollowvomohu3(@RequestParam("currentPage") int page,@RequestParam("size") int size,@RequestParam("nameabc") String name,@RequestParam("qkzt") String qkzt,@RequestParam("lyqd") String lyqd,@RequestParam("yxkc") String yxkc,@RequestParam("gjr") String gjr) {
        IPage<FollowVo> followVoIPage=followVoService.selectmohufollowvo3(page, size, name, qkzt, lyqd, yxkc, gjr);
        return followVoIPage;
    }
}
