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
@ApiModel(value="Staffbusiness对象", description="")
@KeySequence(value = "staffBusiness_seq")
public class Staffbusiness implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STAFFBUSINESS_ID",type = IdType.INPUT)
    private int staffbusinessId;

    @TableField("STAFFBUSINESS_CONTENT")
    private String staffbusinessContent;

    @TableField("BEGIN_TIME")
    private Date beginTime;

    @TableField("END_TIME")
    private Date endTime;

    @TableField("STAFFBUSINESS_STATE")
    private int staffbusinessState;

    @TableField("STAFF_ID1")
    private int staffId1;

    @TableField("STAFF_ID2")
    private int staffId2;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
