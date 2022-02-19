package com.tsm.service.impl.implVo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.StudnetHonorVoMapper;
import com.tsm.service.serviceVo.IStudentHonorVoService;
import com.tsm.vo.StudentHonorVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentHonorVoServiceImpl extends ServiceImpl<StudnetHonorVoMapper, StudentHonorVo> implements IStudentHonorVoService {
   @Autowired
   private StudnetHonorVoMapper mapper;
    @Override
    public IPage<StudentHonorVo> pagest(int page, int size,String id) {
        Page<StudentHonorVo> page1=new Page<>(page,size);
        QueryWrapper<StudentHonorVo> wrapper=new QueryWrapper<>();
        wrapper.eq("sta.STUDENT_ID",id);
        wrapper.orderByDesc("stu.STUDENTHONOR_ID");
        wrapper.eq("stu.DELETED",0);
        IPage<StudentHonorVo> iPage=mapper.selectfollowvo(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<StudentHonorVo> pageth(int page, int size, String id) {
        Page<StudentHonorVo> page1=new Page<>(page,size);
        QueryWrapper<StudentHonorVo> wrapper=new QueryWrapper<>();
        wrapper.eq("sta.STUDENT_ID",id);
        wrapper.orderByDesc("stu.STUDENTTALK_ID");
        wrapper.eq("stu.DELETED",0);
        IPage<StudentHonorVo> iPage=mapper.selectStudentalk(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<StudentHonorVo> pagecf(int page, int size, String id) {
        Page<StudentHonorVo> page1=new Page<>(page,size);
        QueryWrapper<StudentHonorVo> wrapper=new QueryWrapper<>();
        wrapper.eq("sta.STUDENT_ID",id);
        wrapper.orderByDesc("stu.STUNDENTPUNISH_ID");
        wrapper.eq("stu.DELETED",0);
        IPage<StudentHonorVo> iPage=mapper.selectStudentPunish(page1,wrapper);
        return iPage;
    }
}
