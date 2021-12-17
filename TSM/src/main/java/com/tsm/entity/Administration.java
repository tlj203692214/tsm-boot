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
@ApiModel(value="Administration对象", description="")
public class Administration implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ADMINISTRATION_ID")
    private BigDecimal administrationId;

    @TableField("ADMINISTRATION_STATE")
    private BigDecimal administrationState;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DEPT_ID")
    private BigDecimal deptId;

    @TableField("POSITION_ID")
    private BigDecimal positionId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
