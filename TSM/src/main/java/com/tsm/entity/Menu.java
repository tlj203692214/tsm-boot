package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

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
    private int menuId;

    @TableField("MENU_PID")
    private int menuPid;

    @TableField("MENU_NAME")
    private String menuName;

    @TableField("MENU_URL")
    private String menuUrl;

    @TableField("MENU_PERMS")
    private String menuPerms;

    @TableField("MENU_COMPONENT")
    private String menuComponent;

    @TableField("MENU_TYPE")
    private int menuType;

    @TableField("MENU_ICON")
    private String menuIcon;

    @TableField("MENU_ORDERNUM")
    private int menuOrdernum;

    @TableField("MENU_CREATED")
    private Date menuCreated;

    @TableField("MENU_UPDATED")
    private Date menuUpdated;

    @TableField("MENU_STATE")
    private int menuState;

    @TableField("MENU_DESCRIBE")
    private String menuDescribe;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
