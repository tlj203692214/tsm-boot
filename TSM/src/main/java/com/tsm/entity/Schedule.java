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
@ApiModel(value="Schedule对象", description="")
@KeySequence(value = "schedule_seq")
public class Schedule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SCHEDULE_ID",type = IdType.INPUT)
    private int scheduleId;

    @TableField("SCHEDULE_THEME")
    private String scheduleTheme;

    @TableField("SCHEDULE_TYPE")
    private int scheduleType;

    @TableField("BEGIN_TIME")
    private Date beginTime;

    @TableField("END_TIME")
    private Date endTime;

    @TableField("SCHEDULE_PLACE")
    private String schedulePlace;

    @TableField("SCHEDULE_CONTENT")
    private String scheduleContent;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
