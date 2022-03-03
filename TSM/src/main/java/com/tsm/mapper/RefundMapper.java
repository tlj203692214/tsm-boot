package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Refund;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Repository
public interface RefundMapper extends BaseMapper<Refund> {
    @Update("update Refund set deleted=1 where REFUND_ID = #{refundId}")
    public int updatezt(Refund refund);
}
