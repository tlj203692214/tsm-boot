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
@TableName("POSITION_MENU")
@ApiModel(value="PositionMenu对象", description="")
public class PositionMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("POSITIONMENU_ID")
    private BigDecimal positionmenuId;

    @TableField("MENU_ID")
    private BigDecimal menuId;

    @TableField("POSITION")
    private BigDecimal position;

    @TableField("DELETED")
    private BigDecimal deleted;


}
