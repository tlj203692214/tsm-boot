package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel(value="Studenttalk对象", description="")
@KeySequence(value = "studentTalk_seq")
public class Studenttalk implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENTTALK_ID",type = IdType.INPUT)
    private int studenttalkId;

    @TableField("STUDENTTALK_CONTENT")
    private String studenttalkContent;

    @TableField("STUDENTTALK_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studenttalkDate;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
