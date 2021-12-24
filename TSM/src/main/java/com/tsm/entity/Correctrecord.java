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
@ApiModel(value="Correctrecord对象", description="")
@KeySequence(value = "correctRecord_seq")
public class Correctrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CORRECTRECORD_ID",type = IdType.INPUT)
    private int correctrecordId;

    @TableField("CORRECTRECORD_DATE")
    private Date correctrecordDate;

    @TableField("COURSE_ID")
    private int courseId;

    @TableField("COURSECORRECT_ID")
    private int coursecorrectId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
