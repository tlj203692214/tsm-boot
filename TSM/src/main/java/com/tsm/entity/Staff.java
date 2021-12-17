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
@ApiModel(value="Staff对象", description="")
@KeySequence("staff_seq")
public class Staff implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STAFF_ID",type = IdType.INPUT)
    private BigDecimal staffId;

    @TableField("STAFF_NAME")
    private String staffName;

    @TableField("STAFF_PASS")
    private String staffPass;

    @TableLogic
    @TableField("DELETED")
    private BigDecimal deleted;


}
