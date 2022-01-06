package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Suggestions;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

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
    public IPage<Suggestions> suggestions(int page,int size,String zt, String js,String input);
    //新增意见箱
    public int addSuggestions(Suggestions suggestions);
    //修改意见箱
    public int updateSuggestions(Suggestions suggestions);
     //查询意见箱
    public List<Suggestions> selectSuggestions(String userScope);
    //查询所有意见箱(无条件查询)
    public List<Suggestions> selectSuggestionss();
}
