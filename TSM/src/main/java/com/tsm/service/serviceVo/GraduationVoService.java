package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.GraduationVo;

public interface GraduationVoService extends IService<GraduationVo> {
    //分页查询
    IPage<GraduationVo> fyselect(int page,int size);
    //模糊分页查询
    IPage<GraduationVo> mohuselect(int page,int size,String xsname,String bj);
    //模糊分页查询
    IPage<GraduationVo> moselect(int page,int size,String xsname,String bj);
}
