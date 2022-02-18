package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Student;
import com.tsm.mapper.StudentMapper;
import com.tsm.service.IStudentService;
import com.tsm.vo.stujihe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Consumer;

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

    @Override
    public int updatastudent(Student student) {
        //QueryWrapper<Student> studentQueryWrapper=new QueryWrapper<>();
        int a=mapper.updateById(student);
        return a;
    }

    @Override
    public int addstudnet(Student student) {
        int a=mapper.insert(student);
        return a;
    }

    @Override
    public int updatastudentzb(Student student) {
        int a=mapper.updateById(student);
        return a;
    }

    @Override
    public List<Student> list(String id) {
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper.eq("COURSE_ID",id);
        wrapper.or().isNull("COURSE_ID");
//        wrapper .and(i -> i.isNull("CLASSES_ID"));
        List<Student> list=mapper.selectList(wrapper);
        return list;
    }

    @Override
    public List<Student> bjkclist(String id1, String id2) {
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper.eq("COURSE_ID",id1);
        wrapper.eq("CLASSES_ID",id2);
        List<Student> list=mapper.selectList(wrapper);
        return list;
    }

    @Override
    public int updatastudentbjkc(Student student) {
        int  a=mapper.updateById(student);
        return a;
    }

    @Override
    public int updatastudentbjkc1(Student student) {

        UpdateWrapper<Student> wrapper=new UpdateWrapper<>();
        wrapper.eq("COURSE_ID", student.getCourseid());
        wrapper.eq("CLASSES_ID", student.getClassesId());
        int  a=mapper.updateSysRoleById(student,wrapper,student.getClassesId(),student.getCourseid(),student.getStudentId());
        return a;
    }

    @Override
    public List<Student> listselectstudent(String id) {
        QueryWrapper<Student> wrapper=new QueryWrapper<>();
        wrapper.eq("CLASSES_ID",id);
        List<Student> list=mapper.selectList(wrapper);
        return list;
    }

    @Override
    public int updatastudentzt(Student student) {
        int a =mapper.updatestudent(student);
        return a;
    }


}
