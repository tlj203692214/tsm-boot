package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Teaching;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface ITeachingService extends IService<Teaching> {
    //添加排课表
public int addteaching(Teaching teaching);
    //查询最大编号
    public int selectmax();
}
