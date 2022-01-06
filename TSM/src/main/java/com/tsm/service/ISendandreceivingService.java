package com.tsm.service;

import com.tsm.entity.Receiving;
import com.tsm.entity.Sendandreceiving;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-14
 */

public interface ISendandreceivingService extends IService<Sendandreceiving> {
    //新增发件表和收件表的中间表数据
    public  int addsandr(Sendandreceiving sendandreceiving);
    //查询中间表数据
    public List<Sendandreceiving> findAllsandr(int id);
    //修改阅读状态（已读/未读）
    public int xgsandr(Sendandreceiving sendandreceiving);
}
