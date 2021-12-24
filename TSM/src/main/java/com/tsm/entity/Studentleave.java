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
@ApiModel(value="Studentleave对象", description="")
@KeySequence(value = "studentleave_seq")
public class Studentleave implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENTLEAVE_ID",type = IdType.INPUT)
    private int studentleaveId;

    @TableField("STUDENTLEAVE_STARTIME")
    private Date studentleaveStartime;

    @TableField("STUDENTLEAVE_ENDTIME")
    private Date studentleaveEndtime;

    @TableField("STUDENTLEAVE_REASON")
    private String studentleaveReason;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
