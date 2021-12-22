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
@ApiModel(value="Student对象", description="")
@KeySequence(value = "student_seq")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENT_ID",type = IdType.INPUT)
    private BigDecimal studentId;

    @TableField("STUDENT_NAME")
    private String studentName;

    @TableField("STUDENT_SEX")
    private String studentSex;

    @TableField("STUDENT_AGE")
    private BigDecimal studentAge;

    @TableField("STUDENT_BIRTHDAY")
    private LocalDateTime studentBirthday;

    @TableField("STUDENT_PHONE")
    private String studentPhone;

    @TableField("PARENT_PHONE")
    private String parentPhone;

    @TableField("STUDENT_SCHOOL")
    private String studentSchool;

    @TableField("STUDENT_LOC")
    private String studentLoc;

    @TableField("CLASSES_ID")
    private BigDecimal classesId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
