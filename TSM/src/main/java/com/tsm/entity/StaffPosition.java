package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("STAFF_POSITION")
@ApiModel(value="StaffPosition对象", description="")
public class StaffPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STAFFPOSITION_ID")
    private BigDecimal staffpositionId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("POSITION_ID")
    private BigDecimal positionId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
