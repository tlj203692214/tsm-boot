package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Suggestions;
import com.tsm.service.ISuggestionsService;
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
@RequestMapping("/suggestions")
@CrossOrigin(maxAge = 60)
public class SuggestionsController {
    @Autowired
    private ISuggestionsService iSuggestionsService;
    @GetMapping("/suggestions")              //分页模糊查询意见箱
    public IPage<Suggestions> suggestions(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("zt") String zt, @RequestParam("js") String js, @RequestParam("input") String input){
        IPage<Suggestions> iPage=iSuggestionsService.suggestions(page, size, zt, js, input);
        return iPage;
    }
    @PostMapping("/addSuggestions")              //添加新的意见箱
    public int addSuggestions(@RequestBody Suggestions suggestions){
        int a =iSuggestionsService.addSuggestions(suggestions);
        return a;
    }
    @PostMapping("/updateSuggestions")              //添加新的意见箱
    public int updateSuggestions(@RequestBody Suggestions suggestions){
        int a =iSuggestionsService.updateSuggestions(suggestions);
        return a;
    }
}
