package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Notice;
import com.tsm.entity.Send;
import com.tsm.service.INoticeService;
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
@RestController
@RequestMapping("/notice")
@CrossOrigin(maxAge = 60)
public class NoticeController {
    @Autowired
    private INoticeService iNoticeService;
    @GetMapping("/bulletinbox")   //根据条件分页模糊查询公告箱
    public IPage<Notice> updateNotice(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("zt") String zt, @RequestParam("js") String js, @RequestParam("input") String input) {

        IPage<Notice> sendIPage =iNoticeService.updateNotice(page, size, zt, js, input);
        return sendIPage;
    }
    @PostMapping("/addNotice")
    public int addNotice(@RequestBody Notice notice) {

        int  a =iNoticeService.addNotice(notice);
        return a;
    }
    @PostMapping("/delectnotice")
    public int delectnotice(@RequestBody Notice notice) {

        int  a =iNoticeService.delectNotice(notice);
        return a;
    }
    @PostMapping("/releaseNotice")
    public int releaseNotice(@RequestBody Notice notice) {

        int  a =iNoticeService.releaseNotice(notice);
        return a;
    }
    @PostMapping("/DeactivateNotice")
    public int DeactivateNotice(@RequestBody Notice notice) {

        int  a =iNoticeService.DeactivateNotice(notice);
        return a;
    }
    @PostMapping("/updateNotice")
    public int updateNotice(@RequestBody Notice notice) {

        int  a =iNoticeService.updateNotice(notice);
        return a;
    }
}
