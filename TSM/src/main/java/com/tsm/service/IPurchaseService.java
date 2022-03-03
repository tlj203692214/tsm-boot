package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Purchase;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPurchaseService extends IService<Purchase> {
    //添加采购
    public int interpur(Purchase purchase);
    //修改采购
    public int updatepur(Purchase purchase);

    //查询采购名称
    public List<Purchase> selectlist();
    //修改数量
    public int updateputsl(Purchase purchase);
}
