package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.StaffPosition;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStaffPositionService extends IService<StaffPosition> {
//    添加用户角色关联表
    public int insertStaffPos(StaffPosition staffPosition);

    int[] selectPositionById(int id);

}
