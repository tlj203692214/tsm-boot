package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@ApiModel(value="Payapproval对象", description="")
@KeySequence(value = "payApproval_seq")
public class Payapproval implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PAYAPPROVAL_ID",type = IdType.INPUT)
    private int payapprovalId;

    @TableField("PAYAPPROVAL_STATE")
    private int payapprovalState;

    @TableField("EXPENDITURE_ID")
    private int expenditureId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
