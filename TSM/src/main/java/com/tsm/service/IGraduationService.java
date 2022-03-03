package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Graduation;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IGraduationService extends IService<Graduation> {
public int addgraduation(Graduation graduation);

public int updatazt(Graduation graduation);
}
