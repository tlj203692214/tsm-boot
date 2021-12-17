package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Paymoney;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPaymoneyService extends IService<Paymoney> {
        //财务分页查询
        public IPage<Paymoney> selectPayMoney(int page, int pageInfo);
}
