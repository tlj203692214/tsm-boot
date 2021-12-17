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
@ApiModel(value="Expenditure对象", description="")
public class Expenditure implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("EXPENDITURE_ID")
    private BigDecimal expenditureId;

    @TableField("EXPENDITURE_MONEY")
    private BigDecimal expenditureMoney;

    @TableField("EXPENDITURE_DATE")
    private LocalDateTime expenditureDate;

    @TableField("PURCHASE_ID")
    private BigDecimal purchaseId;

    @TableField("REFUND_ID")
    private BigDecimal refundId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
