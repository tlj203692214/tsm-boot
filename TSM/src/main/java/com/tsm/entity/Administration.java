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
@ApiModel(value="Administration对象", description="")
@KeySequence(value="administration_seq")
public class Administration implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="ADMINISTRATION_ID",type= IdType.INPUT)
    private int administrationId;

    @TableField("ADMINISTRATION_STATE")
    private int administrationState;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DEPT_ID")
    private int deptId;

    @TableField("POSITION_ID")
    private int positionId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
