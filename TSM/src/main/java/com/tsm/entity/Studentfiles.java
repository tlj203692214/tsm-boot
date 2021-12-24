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
@ApiModel(value="Studentfiles对象", description="")
@KeySequence(value = "studentFiles_seq")
public class Studentfiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENTFILES_ID",type = IdType.INPUT)
    private int studentfilesId;

    @TableField("STUDENTFILES_NAME")
    private String studentfilesName;

    @TableField("STUDENTFILES_SEX")
    private String studentfilesSex;

    @TableField("STUDENTFILES_AGE")
    private int studentfilesAge;

    @TableField("STUDENTFILES_BIRTHDAY")
    private Date studentfilesBirthday;

    @TableField("STUDENTFILES_PHONE")
    private String studentfilesPhone;

    @TableField("PARENT_PHONE")
    private String parentPhone;

    @TableField("STUDENTFILES_SCHOOL")
    private String studentfilesSchool;

    @TableField("STUDENTFILES_LOC")
    private String studentfilesLoc;

    @TableField("STUDENTFILES_REMARKS")
    private String studentfilesRemarks;

    @TableField("STUDENTFILES_STATE")
    private int studentfilesState;

    @TableField("COURSE_ID")
    private int courseId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
