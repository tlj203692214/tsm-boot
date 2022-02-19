package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.StudentHonorVo;
public interface IStudentHonorVoService extends IService<StudentHonorVo> {
    //荣誉查询分页
    public IPage<StudentHonorVo> pagest(int page,int size,String id);
    //谈话查询分页
    public IPage<StudentHonorVo> pageth(int page,int size,String id);
    //处分查询分页
    public IPage<StudentHonorVo> pagecf(int page,int size,String id);
}
