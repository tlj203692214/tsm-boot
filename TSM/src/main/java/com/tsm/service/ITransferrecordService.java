package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Transferrecord;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface ITransferrecordService extends IService<Transferrecord> {
    //添加转班记录
    public int addItrans(Transferrecord transferrecord);
}
