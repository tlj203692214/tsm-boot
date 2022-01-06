package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Classes;
import com.tsm.mapper.ClassesMapper;
import com.tsm.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class ClassesServiceImpl extends ServiceImpl<ClassesMapper, Classes> implements IClassesService {
    @Autowired
    private ClassesMapper mapper;
    @Override
    public Long ClasssCount(int zt) {
        QueryWrapper<Classes> wrapper = new  QueryWrapper<>();
        wrapper.eq("DELETED",zt);
        Long count = mapper.selectCount(wrapper);
        return count;
    }

    @Override
    public List<Classes> cx() {
        List<Classes> list=mapper.selectList(null);
        return list;
    }
}
