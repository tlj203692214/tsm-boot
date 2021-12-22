package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

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
@ApiModel(value="Payandbranch对象", description="")
@KeySequence(value = "payAndBranch_seq")
public class Payandbranch implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PAYANDBRANCH_ID",type = IdType.INPUT)
    private BigDecimal payandbranchId;

    @TableField("EXPEND_ID")
    private BigDecimal expendId;

    @TableField("INCOME_ID")
    private BigDecimal incomeId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
