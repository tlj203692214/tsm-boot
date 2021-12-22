package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
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
@TableName("POSITION_MENU")
@ApiModel(value="PositionMenu对象", description="")
@KeySequence(value = "positionMenu_seq")
public class PositionMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "POSITIONMENU_ID",type = IdType.INPUT)
    private BigDecimal positionmenuId;

    @TableField("MENU_ID")
    private BigDecimal menuId;

    @TableField("POSITION")
    private BigDecimal position;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
