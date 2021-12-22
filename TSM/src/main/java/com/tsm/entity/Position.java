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
@ApiModel(value="Position对象", description="")
@KeySequence(value = "position_seq")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "POSITION_ID",type = IdType.INPUT)
    private BigDecimal positionId;

    @TableField("POSITION_NAME")
    private String positionName;

    @TableField("POSITION_CODE")
    private String positionCode;

    @TableField("POSITION_REMARK")
    private String positionRemark;

    @TableField("POSITION_CREATED")
    private LocalDateTime positionCreated;

    @TableField("POSITION_UPDATED")
    private LocalDateTime positionUpdated;

    @TableField("POSITION_STATE")
    private BigDecimal positionState;

    @TableField("DEPT_ID")
    private BigDecimal deptId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}