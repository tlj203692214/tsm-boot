package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 
 * </p>
 *
 * @author 军
 * @since 2021-12-29
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Navigation对象", description="")
public class Navigation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("NAVIGATION_ID")
    private int navigationId;

    @TableField("NAVIGATION_NAME")
    private String navigationName;

    @TableField("NAVIGATION_PID")
    private int navigationPid;

    @TableField("NAVIGATION_URL")
    private String navigationUrl;

    @TableField("NAVIGATION_ICON")
    private String navigationIcon;

    @TableField("DELETED")
    private BigDecimal deleted;

    @TableField(exist = false)
    private List<Navigation> childern=new ArrayList<>();

}
