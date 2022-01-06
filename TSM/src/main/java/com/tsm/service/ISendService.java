package com.tsm.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Send;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ..
 * @since 2021-12-09
 */
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface ISendService extends IService<Send> {
    //新增发件箱
    public Send addsend(Send send);
    //分页模糊查询发件箱
    public IPage<Send> findAllSend(int page, int size,String name,String js,String input);
    //逻辑删除发件箱
    public int delectSend(Send send);
}
