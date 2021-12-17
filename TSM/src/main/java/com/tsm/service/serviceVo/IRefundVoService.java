package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Refund;
import com.tsm.vo.RefundVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IRefundVoService extends IService<RefundVo> {
        public IPage<RefundVo> selectRefundVoAll(int page,int size);

}
