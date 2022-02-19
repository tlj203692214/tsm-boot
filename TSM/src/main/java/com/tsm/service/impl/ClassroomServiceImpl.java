package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Classroom;
import com.tsm.mapper.ClassroomMapper;
import com.tsm.service.IClassroomService;
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
public class ClassroomServiceImpl extends ServiceImpl<ClassroomMapper, Classroom> implements IClassroomService {
    @Autowired
    private ClassroomMapper mapper;
    @Override
    public List<Classroom> selectlistclassroom() {
        QueryWrapper<Classroom> wrapper=new QueryWrapper<>();
        List<Classroom> list=mapper.selectList(wrapper);
        return list;
    }
}
