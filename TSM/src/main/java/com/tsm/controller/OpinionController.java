package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Notice;
import com.tsm.entity.Opinion;
import com.tsm.service.IOpinionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-22
 */
@RestController
@RequestMapping("/opinion")
@CrossOrigin(maxAge = 60)
public class OpinionController {
  @Autowired
    private IOpinionService iOpinionService;
    @GetMapping("/opinion")   //根据条件分页模糊查询公告箱
    public IPage<Opinion> opinion(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("zt") String zt,@RequestParam("staffName") String staffName) {

        IPage<Opinion> sendIPage =iOpinionService.opinion(page, size, zt,staffName);
        return sendIPage;
    }
    @PostMapping("/addOpinion")
    public int addOpinion(@RequestBody Opinion opinion) {

        int  a =iOpinionService.addOpinion(opinion);
        return a;
    }
    @PostMapping("/updateOpinion")
    public int updateOpinion(@RequestBody Opinion opinion) {

        int  a =iOpinionService.updateOpinion(opinion);
        return a;
    }
    @PostMapping("/delectOpinion/{opinionId}")
    public int delectOpinion(@PathVariable("opinionId") int opinionId) {
        int  a =iOpinionService.delectOpinion(opinionId);
        return a;
    }
    @GetMapping("/selectOpinion")   //根据条件分页模糊查询公告箱
    public IPage<Opinion> selectOpinion(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("zt") String zt,@RequestParam("staffId") int staffId) {

        IPage<Opinion> sendIPage =iOpinionService.selectOpinion(page, size, zt,staffId);
        return sendIPage;
    }
    @PostMapping("/replyOpinion")
    public int replyOpinion(@RequestBody Opinion opinion) {

        int  a =iOpinionService.replyOpinion(opinion);
        return a;
    }
}