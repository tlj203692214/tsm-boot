package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
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
@KeySequence(value = "refund_seq")
public class Refund implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "REFUND_ID",type = IdType.INPUT)
    private int refundId;

    @TableField("REFUND_DATE")
    private LocalDateTime refundDate;

    @TableField("REFUND_MONEY")
    private BigDecimal refundMoney;

    @TableField("REFUND_STATE")
    private int refundState;

    @TableField("LEAVESCHOOL_ID")
    private BigDecimal leaveschoolId;

    @TableField("CLASSRECORD_ID")
    private BigDecimal classrecordId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
