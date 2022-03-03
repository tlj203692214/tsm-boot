package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.PurchaseVo;

public interface IPurchaseVoService extends IService<PurchaseVo> {
    //分页查询采购信息
    public IPage<PurchaseVo> selectPurchase(int page,int size);

    //分页模糊查询采购信息
    public IPage<PurchaseVo> selectmhPurchase(int page,int size,String name , String jcmc);

    //分页模糊查询出库表
    public IPage<PurchaseVo> selectWarehouse(int page,int size,String name );
}
