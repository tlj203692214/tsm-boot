package com.tsm.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 军
 * @since 2022-02-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("POSITION_NAV")
@ApiModel(value="PositionNav对象", description="")
@KeySequence(value = "position_nav_seq")
public class PositionNav implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "POSITIONMENU_ID",type = IdType.INPUT)
    private int positionmenuId;

    @TableField("NAV_ID")
    private int navId;

    @TableField("POSITION_ID")
    private int positionId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
