package com.tsm.controller;


import com.tsm.entity.Portrait;
import com.tsm.service.IPortraitService;
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
@RequestMapping("/portrait")
public class PortraitController {
    @Autowired
    private IPortraitService portraitService;

    /**
     * 修改图片（！！！失败）
     * @param portrait
     * @return
     */
    @PostMapping("/updatePortrait")
    public int updatePortrait(@RequestBody Portrait portrait){
        return portraitService.updatePortrait(portrait);
    }

    /**
     * 查询头像
     */
    @GetMapping("/selectPortrait/{id}")
    public Portrait selectPortrait(@PathVariable("id") int id){
        return portraitService.selectPortrait(id);
    }

}
