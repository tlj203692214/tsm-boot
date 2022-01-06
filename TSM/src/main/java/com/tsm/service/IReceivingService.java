package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Receiving;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ..
 * @since 2021-12-09
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface IReceivingService extends IService<Receiving> {
    //添加收件箱
    public  int addreceiving(Receiving receiving);
    //模糊分页查询收件箱
    public IPage<Receiving> findAllreceiving(int page,int size,String name,String zt,String js,String input) ;
    //逻辑删除收件箱
    public  int delectsends(Receiving receiving);
    //修改收件箱阅读状态（已读/未读）
    public  int xgreceiving(Receiving receiving);
}
