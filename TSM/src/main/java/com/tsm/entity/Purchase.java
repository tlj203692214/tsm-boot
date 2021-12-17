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
@ApiModel(value="Purchase对象", description="")
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("PURCHASE_ID")
    private BigDecimal purchaseId;

    @TableField("PURCHASE_NAME")
    private String purchaseName;

    @TableField("PURCHASE_NUMBER")
    private BigDecimal purchaseNumber;

    @TableField("PURCHASE_PRICE")
    private BigDecimal purchasePrice;

    @TableField("PURCHASE_AOUNT")
    private BigDecimal purchaseAount;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("PURCHASE_DATE")
    private LocalDateTime purchaseDate;

    @TableField("DELETED")
    private BigDecimal deleted;


}
