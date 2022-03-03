package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel(value="Expenditure对象", description="")
@KeySequence(value = "expenditure_seq")
public class Expenditure implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "EXPENDITURE_ID",type = IdType.AUTO)
    private int expenditureId;

    @TableField("EXPENDITURE_MONEY")
    private Double expenditureMoney;

    @TableField(value = "EXPENDITURE_DATE",fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date expenditureDate;

    @TableField("PURCHASE_ID")
    private int purchaseId;

    @TableField("REFUND_ID")
    private int refundId;

    @TableField("EXPENDITURE_STATE")
    private int expenditureState;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
