package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Student;
import com.tsm.mapper.StudentMapper;
import com.tsm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {
    @Autowired
    private StudentMapper mapper;
    @Override
    public Long student(int zt) {
        QueryWrapper<Student> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",zt);
        Long count = mapper.selectCount(wrapper);
        return count;
    }
}
