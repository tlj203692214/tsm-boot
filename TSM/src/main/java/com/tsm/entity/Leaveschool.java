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
@ApiModel(value="Leaveschool对象", description="")
@KeySequence(value = "leaveSchool_seq")
public class Leaveschool implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "LEAVESCHOOL_ID",type = IdType.INPUT)
    private int leaveschoolId;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("LEAVESCHOOL_DATE")
    private Date leaveschoolDate;

    @TableField("LEAVESCHOOL_REASON")
    private String leaveschoolReason;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
