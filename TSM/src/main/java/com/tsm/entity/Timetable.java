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
@ApiModel(value="Timetable对象", description="")
@KeySequence(value = "timetable_seq")
public class Timetable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TIMETABLE_ID",type = IdType.INPUT)
    private BigDecimal timetableId;

    @TableField("TIMETABLE_MORNING")
    private String timetableMorning;

    @TableField("TIMETABLE_AFTERNOON")
    private String timetableAfternoon;

    @TableField("TIMETABLE_TIME")
    private LocalDateTime timetableTime;

    @TableField("TIMETABLE_MORNINGEND")
    private LocalDateTime timetableMorningend;

    @TableField("TIMETABLE_AFTERNOONSTART")
    private LocalDateTime timetableAfternoonstart;

    @TableField("TIMETABLE_AFTERNOONEND")
    private LocalDateTime timetableAfternoonend;

    @TableField("TIMETABLE_DATE")
    private LocalDateTime timetableDate;

    @TableField("TIMETABLE_STATE")
    private BigDecimal timetableState;

    @TableField("TEACHING_ID")
    private BigDecimal teachingId;

    @TableField("STAFF_ID1")
    private BigDecimal staffId1;

    @TableField("STAFF_ID2")
    private BigDecimal staffId2;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
