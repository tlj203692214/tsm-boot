package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Personal;
import com.tsm.mapper.PersonalMapper;
import com.tsm.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
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
@Transactional
public class PersonalServiceImpl extends ServiceImpl<PersonalMapper, Personal> implements IPersonalService {
    @Autowired
    private PersonalMapper personalMapper;
    @Override
    public int addpersonal(Personal personal) {
        int add = personalMapper.insert(personal);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }

    @Override
    public IPage<Personal> findPersonals(String it, int page, int size) {
        QueryWrapper<Personal> wrapper = new QueryWrapper<>();
        wrapper.eq("PERSONAL_STATE",0);//0未入职
        wrapper.eq("DELETED",0);//0可用，1不可用
        wrapper.like("PERSONAL_NAME",it);
        wrapper.orderByDesc("PERSONAL_ID");
        Page<Personal> page1 = new Page<>(page,size);
        IPage<Personal> iPage = personalMapper.selectPage(page1,wrapper);
//        IPage<Personal> iPage = personalMapper.personalPage(null,it,page1);
        return iPage;
    }

    @Override
    public List<Personal> findPersonals() {
        QueryWrapper<Personal> wrapper = new QueryWrapper<>();
        List<Personal> list = personalMapper.selectList(wrapper);
        return list;
    }

    @Override
    public int updatePersonal(Personal personal) {
        return personalMapper.updateById(personal);
    }


}
