package com.tsm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.tsm.entity.Outwarehouse;
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
public interface OutwarehouseMapper extends BaseMapper<Outwarehouse> {
    @Update("update Outwarehouse set OUTWAREHOUSE_NUMBER = #{outwarehouseNumber,jdbcType=INTEGER} where OUTWAREHOUSE_ID = #{outwarehouseId}")
    public int updateoutwar(Outwarehouse outwarehouse, @Param("outwarehouseNumber") int outwarehouseNumber, @Param("outwarehouseId") int outwarehouseId);

}
