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
@ApiModel(value="Staff对象", description="")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STAFF_ID")
    private int staffId;

    @TableField("STAFF_NAME")
    private String staffName;

    @TableField("STAFF_PASS")
    private String staffPass;

    @TableField("DELETED")
    private int deleted;


}
