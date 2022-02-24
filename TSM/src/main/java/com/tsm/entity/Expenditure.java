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

    @TableId(value = "EXPENDITURE_ID",type = IdType.INPUT)
    private int expenditureId;

    @TableField("EXPENDITURE_MONEY")
    private Double expenditureMoney;

    @TableField("EXPENDITURE_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date expenditureDate;

    @TableField("PURCHASE_ID")
    private int purchaseId;

    @TableField("REFUND_ID")
    private int refundId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
