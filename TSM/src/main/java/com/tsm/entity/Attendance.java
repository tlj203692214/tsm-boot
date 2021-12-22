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
@ApiModel(value="Attendance对象", description="")
@KeySequence(value = "attendance_seq")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ATTENDANCE_ID",type = IdType.INPUT)
    private BigDecimal attendanceId;

    @TableField("ATTENDANCE_DATE")
    private LocalDateTime attendanceDate;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
