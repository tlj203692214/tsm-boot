package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Purchase;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Mapper
public interface PurchaseMapper extends BaseMapper<Purchase> {
@Update("update Purchase set PURCHASE_NUMBER = #{purchaseNumber,jdbcType=INTEGER} where PURCHASE_ID = #{purchaseId}")
    public int updatapursl(Purchase purchase, @Param("purchaseNumber") int purchaseNumber, @Param("purchaseId") int purchaseId);
}
