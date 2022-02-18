package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
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

    @Override
    public int addclasses(Classes classes) {
        int a=mapper.insert(classes);
        return a;
    }

    @Override
    public IPage<Classes> selectclasseslist(int page, int size) {
        Page<Classes> page1=new Page<>(page,size);
        QueryWrapper<Classes> wrapper=new QueryWrapper<>();
        wrapper.orderByDesc("CLASSES_ID");
        IPage<Classes> list=mapper.selecclassestlist(page1,wrapper);
        return list;
    }

    @Override
    public int updataclasses(Classes classes) {
        int a=mapper.updateById(classes);
        return a;
    }

    @Override
    public int updataclasseszt(Classes classes) {
        int a =mapper.updateclasses(classes);
        return a;
    }
}
