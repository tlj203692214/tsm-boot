package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
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
@ApiModel(value="Classes对象", description="")
@KeySequence(value = "classes_seq")
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CLASSES_ID",type = IdType.INPUT)
    private int classesId;

    @TableField("CLASSES_NAME")
    private String classesName;

    @TableField("CLASSES_NUMBER")
    private int classesNumber;

    @TableField("CLASSES_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date classesDate;

    @TableField("CLASSROOM_ID")
    private Long classroomId;

    @TableField("STAFF_ID")
    private Long staffId;

    @TableField("COURSE_ID")
    private Long courseid ;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
