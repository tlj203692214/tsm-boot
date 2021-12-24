package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

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
@KeySequence(value = "inWarehoue_seq")
public class Inwarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "INWAREHOUSE_ID",type = IdType.INPUT)
    private int inwarehouseId;

    @TableField("PURCHASE_ID")
    private int purchaseId;

    @TableField("INWAREHOUSE_DATE")
    private Date inwarehouseDate;

    @TableField("WAREHOUSE_ID")
    private int warehouseId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
