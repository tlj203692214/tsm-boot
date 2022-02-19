package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Stundentpunish;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStundentpunishService extends IService<Stundentpunish> {
    //添加处分
    public int addstudentpun(Stundentpunish stundentpunish);
    //删除处分
    public int delectstudentpun(Stundentpunish stundentpunish);
}
