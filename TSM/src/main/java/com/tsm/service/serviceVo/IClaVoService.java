package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.ClassesVo;

public interface IClaVoService extends IService<ClassesVo> {
    //分页查询班级信息
    public IPage<ClassesVo> selectClassesVopage(int page,int size);

    //模糊分页查询班级信息
    public IPage<ClassesVo> selectmhClassesVopage(int page,int size,String bjname,String bzr,String jsname);

    //分页查询班级里的学生
    public IPage<ClassesVo> selectStudent (int page,int size,String id);

    //分页模糊查询班级里的学生
    public IPage<ClassesVo> selectmhstudent(int page,int size);

    //分页查询班级课表
    public IPage<ClassesVo> selectkebiao(int page,int size,String id);

}
