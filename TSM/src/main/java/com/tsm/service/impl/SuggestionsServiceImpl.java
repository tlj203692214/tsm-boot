package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tsm.entity.Suggestions;
import com.tsm.mapper.SuggestionsMapper;
import com.tsm.service.ISuggestionsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-22
 */
@Service
public class SuggestionsServiceImpl extends ServiceImpl<SuggestionsMapper, Suggestions> implements ISuggestionsService {
    @Autowired
    private  SuggestionsMapper suggestionsMapper;
    @Override
    public IPage<Suggestions> suggestions(int page, int size,String zt, String js, String input) {
        QueryWrapper<Suggestions>  wrapper=new QueryWrapper<>();
        if(js.equals("意见箱名称")){
            wrapper.like("SUGGESTIONS_NAME",input);
        }else if(js.equals("管理员")){
            wrapper.like("SUGGESTIONS_MANAGE",input);
        }else{
            wrapper.like("USER_SCOPE",input);
        }
        if(zt.equals("a")){

        }else if(zt.equals("b")){
            wrapper.eq("DELETED",0);
        }else{
            wrapper.eq("DELETED",1);
        }
        Page<Suggestions> page1=new Page<>(page,size);
        IPage<Suggestions> iPage=suggestionsMapper.selectPage(page1,wrapper);
        return iPage;
    }

    @Override
    public int addSuggestions(Suggestions suggestions) {
        int a=suggestionsMapper.insert(suggestions);
        return a;
    }

    @Override
    public int updateSuggestions(Suggestions suggestions) {
        int a=suggestionsMapper.updateById(suggestions);
        return  a;
    }
}