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
@ApiModel(value="Expend对象", description="")
@KeySequence(value = "expend_seq")
public class Expend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "EXPEND_ID",type = IdType.INPUT)
    private int expendId;

    @TableField("EXPEND_MONEY")
    private int expendMoney;

    @TableField("EXPEND_DATE")
    private Date expendDate;

    @TableField("PAYAPPROVAL_ID")
    private int payapprovalId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
