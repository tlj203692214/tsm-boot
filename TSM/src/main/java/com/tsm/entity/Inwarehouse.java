package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Inwarehouse对象", description="")
public class Inwarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("INWAREHOUSE_ID")
    private BigDecimal inwarehouseId;

    @TableField("PURCHASE_ID")
    private BigDecimal purchaseId;

    @TableField("INWAREHOUSE_DATE")
    private LocalDateTime inwarehouseDate;

    @TableField("WAREHOUSE_ID")
    private BigDecimal warehouseId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
