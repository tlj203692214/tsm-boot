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
@ApiModel(value="Stafffiles对象", description="")
public class Stafffiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STAFFFILES_ID")
    private BigDecimal stafffilesId;

    @TableField("STAFFFILES_NAME")
    private String stafffilesName;

    @TableField("STAFFFILES_SEX")
    private String stafffilesSex;

    @TableField("STAFFFILES_AGE")
    private BigDecimal stafffilesAge;

    @TableField("STAFFFILES_DATE")
    private LocalDateTime stafffilesDate;

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
    private BigDecimal stafffilesMonney;

    @TableField("STAFFFILES_POSITION")
    private String stafffilesPosition;

    @TableField("DELETED")
    private BigDecimal deleted;


}
