package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Student;
import com.tsm.vo.stujihe;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStudentService extends IService<Student> {
    public Long student(int zt);

    //编辑学生
    public int updatastudent(Student student);

    //添加学生
    public int addstudnet(Student student);

    //学生转班修改
    public int updatastudentzb(Student student);

    //根据课程查询学生
    public List<Student> list(String id);

    //班级课程编号查询
    public List<Student> bjkclist(String id1,String id2);
    //学生添加班级和课程
    public int updatastudentbjkc(Student student);
    //学生修改班级和课程
    public int updatastudentbjkc1(Student student);

    //根据班级察学生
    public List<Student> listselectstudent(String id);
    //修改学生状态
    public int updatastudentzt(Student student);
}
