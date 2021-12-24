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
@ApiModel(value="Coursecorrect对象", description="")
@KeySequence(value = "courseCorrect_seq")
public class Coursecorrect implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "COURSECORRECT_ID",type = IdType.INPUT)
    private int coursecorrectId;

    @TableField("COURSECORRECT_REMARKS")
    private String coursecorrectRemarks;

    @TableField("COURSECORRECT_DATE")
    private Date coursecorrectDate;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
