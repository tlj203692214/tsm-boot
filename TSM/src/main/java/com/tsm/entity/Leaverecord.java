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
@ApiModel(value="Leaverecord对象", description="")
public class Leaverecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("LEAVERECORD_ID")
    private BigDecimal leaverecordId;

    @TableField("LEAVESCHOOL_ID")
    private BigDecimal leaveschoolId;

    @TableField("REFUND_ID")
    private BigDecimal refundId;

    @TableField("LEAVERECORD_DATE")
    private LocalDateTime leaverecordDate;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
