package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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
@ApiModel(value="Attendance对象", description="")
@KeySequence(value = "attendance_seq")
public class Attendance implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ATTENDANCE_ID",type = IdType.INPUT)
    private int attendanceId;

    @TableField("ATTENDANCE_DATE")
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date attendanceDate;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
