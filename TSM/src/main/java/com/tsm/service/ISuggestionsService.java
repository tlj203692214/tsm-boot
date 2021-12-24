package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Suggestions;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-22
 */
public interface ISuggestionsService extends IService<Suggestions> {
    //分页模糊查询意见箱
    public IPage<Suggestions> suggestions(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size,@RequestParam("zt") String zt, @RequestParam("js") String js, @RequestParam("input") String input);
    //新增意见箱
    public int addSuggestions(@RequestBody Suggestions suggestions);
    //修改意见箱
    public int updateSuggestions(@RequestBody Suggestions suggestions);
}
