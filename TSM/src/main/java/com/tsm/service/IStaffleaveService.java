package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Staffleave;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStaffleaveService extends IService<Staffleave> {
    public int addstaffleave(Staffleave staffleave);
}
