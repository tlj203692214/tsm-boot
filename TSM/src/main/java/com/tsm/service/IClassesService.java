package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Classes;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IClassesService extends IService<Classes> {
    public Long ClasssCount(int zt);
    
    //查询班级
    public List<Classes> cx();
}
