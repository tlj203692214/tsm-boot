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
@ApiModel(value="Dept对象", description="")
@KeySequence(value = "dept_seq")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "DEPT_ID",type = IdType.INPUT)
    private BigDecimal deptId;

    @TableField("DEPT_NAME")
    private String deptName;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
