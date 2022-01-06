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
        /**
         * 财务：报班缴费模糊查询
         */
        public IPage<payMoneyVo> selectPayMoney(int page, int pageInfo,String stuname,String payName,int state);

        /**
         * 统计总金额
         */
        public double countMoney();

        /**
         * 根据状态统计总金额
         */
        public double countMoneyByState();
        public double countMoneyByState2();


}
