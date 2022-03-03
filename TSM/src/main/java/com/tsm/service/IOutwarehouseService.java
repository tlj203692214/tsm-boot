package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Outwarehouse;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IOutwarehouseService extends IService<Outwarehouse> {
    //添加出库
    public int addoutwar(Outwarehouse outwarehouse);
    //修改出库数量
    public int updateoutwar(Outwarehouse outwarehouse);
}
