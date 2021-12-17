package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Studentfiles对象", description="")
public class Studentfiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STUDENTFILES_ID")
    private BigDecimal studentfilesId;

    @TableField("STUDENTFILES_NAME")
    private String studentfilesName;

    @TableField("STUDENTFILES_SEX")
    private String studentfilesSex;

    @TableField("STUDENTFILES_AGE")
    private BigDecimal studentfilesAge;

    @TableField("STUDENTFILES_BIRTHDAY")
    private LocalDateTime studentfilesBirthday;

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
    private BigDecimal studentfilesState;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
