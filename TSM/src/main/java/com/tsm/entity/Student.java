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
@ApiModel(value="Student对象", description="")
@KeySequence(value = "student_seq")
public class Student implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENT_ID",type = IdType.INPUT)
    private int studentId;

    @TableField("STUDENT_NAME")
    private String studentName;

    @TableField("STUDENT_SEX")
    private String studentSex;

    @TableField("STUDENT_AGE")
    private int studentAge;

    @TableField("STUDENT_BIRTHDAY")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studentBirthday;

    @TableField("STUDENT_PHONE")
    private String studentPhone;

    @TableField("PARENT_PHONE")
    private String parentPhone;

    @TableField("STUDENT_SCHOOL")
    private String studentSchool;

    @TableField("STUDENT_LOC")
    private String studentLoc;

    @TableField("CLASSES_ID")
    private Long classesId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;

    @TableField(value = "STUDENT_ENTRANCE",fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studententrance; //入学时间

    @TableField("COURSE_ID")
    private Long courseid ;//课程

}
