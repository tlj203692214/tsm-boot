package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Income对象", description="")
public class Income implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("INCOME_ID")
    private BigDecimal incomeId;

    @TableField("INCOME_STATE")
    private BigDecimal incomeState;

    @TableField("PAYMONEY_ID")
    private BigDecimal paymoneyId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
