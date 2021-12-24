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
@ApiModel(value="Leaveapproval对象", description="")
@KeySequence(value = "leaveApproval_seq")
public class Leaveapproval implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "LEAVEAPPROVAL_ID",type = IdType.INPUT)
    private int leaveapprovalId;

    @TableField("LEAVEAPPROVAL_DATE")
    private Date leaveapprovalDate;

    @TableField("STUDENTLEAVE_ID")
    private int studentleaveId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
