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
@ApiModel(value="Outwarehouse对象", description="")
@KeySequence(value = "outWarehose_seq")
public class Outwarehouse implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "OUTWAREHOUSE_ID",type = IdType.INPUT)
    private int outwarehouseId;

    @TableField("OUTWAREHOUSE_NUMBER")
    private int outwarehouseNumber;

    @TableField("OUTWAREHOUSE_TIME")
    private Date outwarehouseTime;

    @TableField("CLASSES_ID")
    private int classesId;

    @TableField("STAFF_ID")
    private int staffId;

   // @TableField("STAFF_ID2")
    //private int staffId2;

  //  @TableField("WAREHOUSE_ID")
   // private int warehouseId;

    @TableField("PURCHASE_ID")
    private int purchaseId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
