package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Student;
import com.tsm.mapper.StudentMapper;
import com.tsm.mapper.voMapper.FollowVoMapper;
import com.tsm.mapper.voMapper.StudentVoMapper;
import com.tsm.service.serviceVo.FollowVoService;
import com.tsm.service.serviceVo.StudentVoService;
import com.tsm.vo.FollowVo;
import com.tsm.vo.StudnetVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentVoServiceImpl  extends ServiceImpl<StudentVoMapper, StudnetVo> implements StudentVoService {
    @Autowired
    private StudentVoMapper mapper;
    @Override
    public IPage<StudnetVo> cxstudentfy(int page, int size) {
        Page<StudnetVo> page1=new Page<>(page,size);
        QueryWrapper<StudnetVo> wrapper=new QueryWrapper<>();
        wrapper.orderByDesc("STUDENT_ID");
        IPage<StudnetVo> iPage=mapper.ipage(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<StudnetVo> mohustudent(int page, int size, String xsname, String bj, Boolean sffb,String values) {
        Page<StudnetVo> page1=new Page<>(page,size);
        QueryWrapper<StudnetVo> wrapper=new QueryWrapper<>();
if(values.equals("学生名字")) {
    if (xsname != null && xsname.length() != 0) {
        wrapper.eq("s.STUDENT_NAME", xsname);
    } else {
        log.debug(xsname + "xsname是空");
    }
    if (bj != null && bj.length() != 0) {
        wrapper.eq("c.CLASSES_ID", bj);
    } else {
        log.debug(bj + "bj是空");
    }
    if (sffb == false) {
        log.debug(sffb + "sffb是空");
    } else {
        // wrapper.eq("c.CLASSES_ID","");
        wrapper.isNull("c.CLASSES_ID");
    }
}else {
    if (xsname != null && xsname.length() != 0) {
        wrapper.eq("c.CLASSES_NAME", xsname);
    } else {
        log.debug(xsname + "xsname是空");
    }
    if (bj != null && bj.length() != 0) {
        wrapper.eq("c.CLASSES_ID", bj);
    } else {
        log.debug(bj + "bj是空");
    }
    if (sffb == false) {
        log.debug(sffb + "sffb是空");
    } else {
        // wrapper.eq("c.CLASSES_ID","");
        wrapper.isNull("c.CLASSES_ID");
    }
}
        IPage<StudnetVo> iPage=mapper.mohustudent(page1,wrapper);
        return iPage;
    }

}
