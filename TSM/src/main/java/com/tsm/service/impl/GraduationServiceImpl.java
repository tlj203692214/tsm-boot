package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Graduation;
import com.tsm.mapper.GraduationMapper;
import com.tsm.service.IGraduationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class GraduationServiceImpl extends ServiceImpl<GraduationMapper, Graduation> implements IGraduationService {
    @Autowired
    private GraduationMapper graduationMapper;

    @Override
    public int addgraduation(Graduation graduation) {
        graduation.setGraduationDate(new Date());
        int a=graduationMapper.insert(graduation);
        return a;
    }
}
