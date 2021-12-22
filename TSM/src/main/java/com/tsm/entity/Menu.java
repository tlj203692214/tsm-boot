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
@ApiModel(value="Menu对象", description="")
@KeySequence(value = "menu_seq")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "MENU_ID",type = IdType.INPUT)
    private BigDecimal menuId;

    @TableField("MENU_PID")
    private BigDecimal menuPid;

    @TableField("MENU_NAME")
    private String menuName;

    @TableField("MENU_URL")
    private String menuUrl;

    @TableField("MENU_PERMS")
    private String menuPerms;

    @TableField("MENU_COMPONENT")
    private String menuComponent;

    @TableField("MENU_TYPE")
    private BigDecimal menuType;

    @TableField("MENU_ICON")
    private String menuIcon;

    @TableField("MENU_ORDERNUM")
    private BigDecimal menuOrdernum;

    @TableField("MENU_CREATED")
    private LocalDateTime menuCreated;

    @TableField("MENU_UPDATED")
    private LocalDateTime menuUpdated;

    @TableField("MENU_STATE")
    private BigDecimal menuState;

    @TableField("MENU_DESCRIBE")
    private String menuDescribe;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
