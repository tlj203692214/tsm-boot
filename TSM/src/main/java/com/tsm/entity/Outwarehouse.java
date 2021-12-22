package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
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
@ApiModel(value="Outwarehouse对象", description="")
@KeySequence(value = "outWarehose_seq")
public class Outwarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "OUTWAREHOUSE_ID",type = IdType.INPUT)
    private BigDecimal outwarehouseId;

    @TableField("OUTWAREHOUSE_NUMBER")
    private BigDecimal outwarehouseNumber;

    @TableField("OUTWAREHOUSE_TIME")
    private LocalDateTime outwarehouseTime;

    @TableField("CLASSES_ID")
    private BigDecimal classesId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("STAFF_ID2")
    private BigDecimal staffId2;

    @TableField("WAREHOUSE_ID")
    private BigDecimal warehouseId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
