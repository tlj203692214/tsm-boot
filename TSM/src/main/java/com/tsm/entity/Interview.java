package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@ApiModel(value="Interview对象", description="")
@KeySequence(value = "interview_seq")
public class Interview implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "INTERVIEW_ID",type = IdType.INPUT)
    private int interviewId;

    @TableField("INTERVIEW_CENTENT")
    private String interviewCentent;

    @TableField("INTERVIEW_STATE")
    private int interviewState;

    @TableField("STAFFFILES_ID")
    private int stafffilesId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
