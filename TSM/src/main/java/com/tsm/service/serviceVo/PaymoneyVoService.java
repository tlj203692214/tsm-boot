package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.payMoneyVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface PaymoneyVoService extends IService<payMoneyVo> {
        //财务分页查询
        public IPage<payMoneyVo> selectPayMoney(int page, int pageInfo);
}
