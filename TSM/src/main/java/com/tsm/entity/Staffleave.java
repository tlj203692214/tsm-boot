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
@ApiModel(value="Staffleave对象", description="")
@KeySequence(value = "staffleave_seq")
public class Staffleave implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "LEAVE_ID",type = IdType.INPUT)
    private int leaveId;

    @TableField("LEAVE_CONTENT")
    private String leaveContent;

    @TableField("BEGIN_TIME")
    private Date beginTime;

    @TableField("END_TIME")
    private Date endTime;

    @TableField("LEAVE_STATE")
    private int leaveState;

    @TableField("STAFF_ID1")
    private int staffId1;

    @TableField("STAFF_ID2")
    private int staffId2;

    @TableField("DELETED")
    private int deleted;


}
