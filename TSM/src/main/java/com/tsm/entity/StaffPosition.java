package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@KeySequence(value = "staffPosition_seq")
public class StaffPosition implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STAFFPOSITION_ID",type = IdType.INPUT)
    private int staffpositionId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("POSITION_ID")
    private int positionId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
