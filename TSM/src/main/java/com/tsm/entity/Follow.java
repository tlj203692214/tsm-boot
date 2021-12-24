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
@ApiModel(value="Follow对象", description="")
@KeySequence(value = "follow_seq")
public class Follow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "FOLLOW_ID",type = IdType.INPUT)
    private int followId;

    @TableField("FOLLOW_CONTENT")
    private String followContent;

    @TableField("FOLLOW_DATE")
    private Date followDate;

    @TableField("STUDENTFILES_ID")
    private int studentfilesId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
