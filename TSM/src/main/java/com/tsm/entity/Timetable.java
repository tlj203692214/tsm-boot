package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
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
@ApiModel(value="Timetable对象", description="")
@KeySequence(value = "timetable_seq")
public class Timetable implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TIMETABLE_ID",type = IdType.INPUT)
    private int timetableId;

    @TableField("TIMETABLE_MORNING")
    private String timetableMorning;

    @TableField("TIMETABLE_AFTERNOON")
    private String timetableAfternoon;

    @TableField("TIMETABLE_TIME")
    private Date timetableTime;

    @TableField("TIMETABLE_MORNINGEND")
    private Date timetableMorningend;

    @TableField("TIMETABLE_AFTERNOONSTART")
    private Date timetableAfternoonstart;

    @TableField("TIMETABLE_AFTERNOONEND")
    private Date timetableAfternoonend;

    @TableField("TIMETABLE_DATE")
    private Date timetableDate;

    @TableField("TIMETABLE_STATE")
    private int timetableState;

    @TableField("TEACHING_ID")
    private int teachingId;

    @TableField("STAFF_ID1")
    private int staffId1;

    @TableField("STAFF_ID2")
    private int staffId2;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
