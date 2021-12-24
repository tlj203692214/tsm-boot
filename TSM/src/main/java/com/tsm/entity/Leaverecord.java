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
@ApiModel(value="Leaverecord对象", description="")
@KeySequence(value = "leavereCord")
public class Leaverecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "LEAVERECORD_ID",type = IdType.INPUT)
    private int leaverecordId;

    @TableField("LEAVESCHOOL_ID")
    private int leaveschoolId;

    @TableField("REFUND_ID")
    private int refundId;

    @TableField("LEAVERECORD_DATE")
    private Date leaverecordDate;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
