package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Leaveschool;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface ILeaveschoolService extends IService<Leaveschool> {
    public int addleaveschool(Leaveschool leaveschool);

    public int selectid();
}
