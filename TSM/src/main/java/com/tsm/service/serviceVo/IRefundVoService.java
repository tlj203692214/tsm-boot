package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.RefundVo;

import java.math.BigDecimal;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IRefundVoService extends IService<RefundVo> {
        /**
         * 根据名字模糊查询，根据状态查询
         * @param page
         * @param size
         * @param name
         * @param state
         * @return
         */
        public IPage<RefundVo> selectRefundVoAll(int page,int size,String name,int state);

        /**
         * 根据id修改审批状态
         */
        public int updateState(int id);




}
