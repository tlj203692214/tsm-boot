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
@ApiModel(value="Refund对象", description="")
public class Refund implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("REFUND_ID")
    private BigDecimal refundId;

    @TableField("REFUND_DATE")
    private LocalDateTime refundDate;

    @TableField("REFUND_MONEY")
    private BigDecimal refundMoney;

    @TableField("REFUND_STATE")
    private BigDecimal refundState;

    @TableField("LEAVESCHOOL_ID")
    private BigDecimal leaveschoolId;

    @TableField("CLASSRECORD_ID")
    private BigDecimal classrecordId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
