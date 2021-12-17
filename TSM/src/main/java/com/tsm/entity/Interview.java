package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

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
@ApiModel(value="Interview对象", description="")
public class Interview implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("INTERVIEW_ID")
    private BigDecimal interviewId;

    @TableField("INTERVIEW_CENTENT")
    private String interviewCentent;

    @TableField("INTERVIEW_STATE")
    private BigDecimal interviewState;

    @TableField("STAFFFILES_ID")
    private BigDecimal stafffilesId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
