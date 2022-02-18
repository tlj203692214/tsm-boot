package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Paymoney;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPaymoneyService extends IService<Paymoney> {
        public Long PaymoneyCount(int zt);
        public double PaymoneySum(int zt);

        int deleteByIds(int ids);

        //添加缴费记录
        public int intoPaymone(Paymoney paymoney);
}
