package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Student;
import com.tsm.vo.FollowVo;
import com.tsm.vo.StudnetVo;

public interface StudentVoService extends IService<StudnetVo> {
    ///分页
    public IPage<StudnetVo> cxstudentfy(int page, int size);

    //模糊查询分页
    public IPage<StudnetVo> mohustudent(int page, int size,String xsname,String bj,Boolean sffb,String values);
}
