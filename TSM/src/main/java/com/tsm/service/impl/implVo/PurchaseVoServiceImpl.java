package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.PurchaseVoMapper;
import com.tsm.service.serviceVo.IPurchaseVoService;
import com.tsm.vo.PurchaseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseVoServiceImpl extends ServiceImpl<PurchaseVoMapper, PurchaseVo> implements IPurchaseVoService {
    @Autowired
    private PurchaseVoMapper mapper;

    @Override
    public IPage<PurchaseVo> selectPurchase(int page, int size) {
        Page<PurchaseVo> page1=new Page<>(page,size);
        QueryWrapper<PurchaseVo> wrapper=new QueryWrapper<>();
        wrapper.eq("pur.DELETED",0);
        wrapper.orderByDesc("pur.PURCHASE_ID");
        IPage<PurchaseVo> iPage=mapper.selectpurchase(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<PurchaseVo> selectmhPurchase(int page, int size, String name,String jcmc) {
        Page<PurchaseVo> page1 = new Page<>(page, size);
        QueryWrapper<PurchaseVo> wrapper = new QueryWrapper<>();
         if (jcmc.equals("教程名称")) {
            wrapper.eq("pur.DELETED", 0);
            if (name != null && name.length() != 0) {
                wrapper.like("pur.PURCHASE_NAME", name);
            }
            wrapper.orderByDesc("pur.PURCHASE_ID");

        }else if(jcmc.equals("入库人")){
             wrapper.eq("pur.DELETED", 0);
             if (name != null && name.length() != 0) {
                 wrapper.like("sta.STAFF_NAME", name);
             }
             wrapper.orderByDesc("pur.PURCHASE_ID");
        }
        IPage<PurchaseVo> iPage = mapper.selectpurchase(page1, wrapper);
        return iPage;
    }

    @Override
    public IPage<PurchaseVo> selectWarehouse(int page, int size, String name) {
        Page<PurchaseVo> page1 = new Page<>(page, size);
        QueryWrapper<PurchaseVo> wrapper=new QueryWrapper<>();
        wrapper.eq("ou.DELETED", 0);
        if(name!=null&&name.length()!=0){
            wrapper.like("pur.PURCHASE_NAME",name);
        }
        wrapper.orderByDesc("ou.OUTWAREHOUSE_ID");
        IPage<PurchaseVo> iPage=mapper.selectoutWarehouse(page1,wrapper);
        return iPage;
    }

}
