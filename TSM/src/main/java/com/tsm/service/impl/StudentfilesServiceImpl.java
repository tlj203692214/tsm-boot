package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Studentfiles;
import com.tsm.mapper.StudentfilesMapper;
import com.tsm.service.IStudentfilesService;
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
public class StudentfilesServiceImpl extends ServiceImpl<StudentfilesMapper, Studentfiles> implements IStudentfilesService {
@Autowired
private StudentfilesMapper studentfilesMapper;
    @Override
    public int addStudenfiles(Studentfiles studentfiles) {
        studentfiles.setDeleted(0l);
        int a =studentfilesMapper.insert(studentfiles);
        return a;
    }

    @Override
    public int updateStudenfiles(Studentfiles studentfiles) {
        studentfiles.setDeleted(0l);
        int a=studentfilesMapper.updateById(studentfiles);
        return a;
    }

    @Override
    public int updatestudenfileszt(Studentfiles studentfiles) {

        studentfiles.setStudentfilesState(2l);
        int a=studentfilesMapper.updateById(studentfiles);
        return a;
    }

    @Override
    public int updatestudenfilesjhzt(Studentfiles studentfiles) {
        studentfiles.setStudentfilesState(0l);
        int a=studentfilesMapper.updateById(studentfiles);
        return a;
    }

    @Override
    public int scselect(Studentfiles studentfiles) {
        //studentfiles.setDeleted(1l);
        int a=studentfilesMapper.updatestudent(studentfiles);
        return a;
    }

    @Override
    public int updatestudnetzt(Studentfiles studentfiles) {
        studentfiles.setStudentfilesState(3l);
        int a=studentfilesMapper.updateById(studentfiles);
        return a;
    }
}
