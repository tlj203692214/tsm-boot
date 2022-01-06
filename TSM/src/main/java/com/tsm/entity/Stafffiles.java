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
@ApiModel(value="Stafffiles对象", description="")
@KeySequence(value = "staffFiles_seq")
public class Stafffiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STAFFFILES_ID",type = IdType.INPUT)
    private int stafffilesId;

    @TableField("STAFFFILES_NAME")
    private String stafffilesName;

    @TableField("STAFFFILES_SEX")
    private String stafffilesSex;

    @TableField("STAFFFILES_AGE")
    private int stafffilesAge;

    @TableField("STAFFFILES_DATE")
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date stafffilesDate;

    @TableField("STAFFFILES_PHONE")
    private String stafffilesPhone;

    @TableField("STAFFFILES_IDCRAD")
    private String stafffilesIdcrad;

    @TableField("STAFFFILES_EDUCATION")
    private String stafffilesEducation;

    @TableField("STAFFFILES_NFAMILY")
    private String stafffilesNfamily;

    @TableField("STAFFFILES_ADDRESS")
    private String stafffilesAddress;

    @TableField("STAFFFILE_GRADUATION")
    private String stafffileGraduation;

    @TableField("STAFFFILES_EXPERIENCE")
    private String stafffilesExperience;

    @TableField("STAFFFILES_MONNEY")
    private Double stafffilesMonney;

    @TableField("STAFFFILES_POSITION")
    private String stafffilesPosition;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
