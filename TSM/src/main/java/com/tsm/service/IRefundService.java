package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Refund;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IRefundService extends IService<Refund> {
        public IPage<Refund> selectRefund(int page,int size);
        public Refund selectAllById(int id);

        public int updateState(int id);

        public int deleteById(int id);
}
