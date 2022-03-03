package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.ClassesVoMapper;
import com.tsm.service.serviceVo.IClaVoService;
import com.tsm.vo.ClassesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassesVoServiceImpl extends ServiceImpl<ClassesVoMapper, ClassesVo> implements IClaVoService {
    @Autowired
    private ClassesVoMapper mapper;

    @Override
    public IPage<ClassesVo> selectClassesVopage(int page, int size) {
        Page<ClassesVo> page1=new Page<>(page,size);
        QueryWrapper<ClassesVo> wrapper=new QueryWrapper<>();
        wrapper.orderByDesc("cla.CLASSES_ID");

        IPage<ClassesVo> iPage=mapper.selectClassesVo(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<ClassesVo> selectmhClassesVopage(int page, int size, String bjname, String bzr, String jsname) {
        Page<ClassesVo> page1=new Page<>(page,size);
        QueryWrapper<ClassesVo> wrapper=new QueryWrapper<>();
        if(bjname!=null&&bjname.length()!=0){
            wrapper.like("cla.CLASSES_NAME",bjname);
        }else{
            System.out.println(bjname+"空");
        }
        if (bzr!=null&&bzr.length()!=0){
            wrapper.eq("sta.STAFF_ID",bzr);
        }else{
            System.out.println(bzr+"空");
        }
        if (jsname!=null&&jsname.length()!=0){
            wrapper.eq("rom.CLASSROOM_ID",jsname);
        }else{
            System.out.println(jsname+"空");
        }
        wrapper.eq(" cla.DELETED",0);
//        cou.COURSE_ID,cla.CLASSES_NUMBER,cla.CLASSES_ID,cla.CLASSES_NAME,rom.CLASSROOM_ID,rom.CLASSROOM_NAME,sta.STAFF_ID,sta.STAFF_NAME,COUNT(stu.CLASSES_ID) studentzh," +
//        "cla.CLASSES_DATE,cou.COURSE_NAME
        wrapper.groupBy("cla.CLASSES_ID","cla.CLASSES_NAME","rom.CLASSROOM_NAME",

                "sta.STAFF_NAME","cla.CLASSES_DATE","cou.COURSE_NAME","rom.CLASSROOM_ID","cou.COURSE_ID","sta.STAFF_ID","cla.CLASSES_NUMBER");
        wrapper.orderByDesc("cla.CLASSES_ID");
        IPage<ClassesVo> iPage=mapper.selectClassesmhVo(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<ClassesVo> selectStudent(int page, int size, String id) {
        Page<ClassesVo> page1=new Page<>(page,size);
        QueryWrapper<ClassesVo> wrapper=new QueryWrapper<>();
        wrapper.eq("cla.CLASSES_ID",id);
        wrapper.eq("sta.DELETED",0);
        wrapper.orderByDesc("sta.STUDENT_ID");
        IPage<ClassesVo> iPage=mapper.selectstudentVo(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<ClassesVo> selectmhstudent(int page, int size) {
        Page<ClassesVo> page1=new Page<>(page,size);
        QueryWrapper<ClassesVo> wrapper=new QueryWrapper<>();

        wrapper.orderByDesc("sta.STUDENT_ID");
        IPage<ClassesVo> iPage=mapper.selectstudentVo(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<ClassesVo> selectkebiao(int page, int size, String id) {
        Page<ClassesVo> page1=new Page<>(page,size);
        QueryWrapper<ClassesVo> wrapper=new QueryWrapper<>();
        wrapper.eq("cla.CLASSES_ID",id);
        wrapper.orderByDesc("tim.TIMETABLE_ID");
        IPage<ClassesVo> iPage=mapper.selectkebioaVo(page1,wrapper);
        return iPage;
    }
}
