package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Draft;
import com.tsm.service.IDraftService;
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
@RequestMapping("/draft")
@CrossOrigin(maxAge = 60)
public class DraftController {
    @Autowired
    private IDraftService iDraftService;
    @PostMapping("/addDraft")
    public int addDraft(@RequestBody Draft draft){
        int a= iDraftService.addDraft(draft);
        return  a;
    }
    @GetMapping("/Draft")
    public IPage<Draft> findAllDraft(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("StaffNames") String name, @RequestParam("js") String js, @RequestParam("input") String input) {

        IPage<Draft> draftIPage =iDraftService.findAllDraft(page, size, name, js, input);
        return draftIPage;
    }
    @PostMapping("/delectdraft")
    public int delectdraft(@RequestBody Draft draft) {
        Integer result=iDraftService.delectDraft(draft);
        return result;

    }
}
