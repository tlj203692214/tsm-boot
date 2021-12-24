package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@ApiModel(value="Warehouse对象", description="")
@KeySequence(value = "warehouse_seq")
public class Warehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "WAREHOUSE_ID",type = IdType.INPUT)
    private int warehouseId;

    @TableField("WAREHOUSE_NAME")
    private String warehouseName;

    @TableField("WAREHOUSE_NUMBER")
    private int warehouseNumber;

    @TableField("WAREHOUSE_PRICE")
    private Double warehousePrice;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
