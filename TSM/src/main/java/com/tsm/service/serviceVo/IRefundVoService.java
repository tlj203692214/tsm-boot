package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.RefundVo;

import java.math.BigDecimal;
import java.util.List;

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
         */
        public IPage<RefundVo> selectRefundVoAll(int page,int size,String name,int state);

        /**
         * 根据id修改审批状态
         */
        public int updateState(int id);

        /**
         * 统计查询所有的金额
         */
        public double selectRefundVo();

//        统计未审核的金额
        public double selectCountState();
//        统计审核的金额
        public double selectCountState2();

}
