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
@ApiModel(value="Teaching对象", description="")
@KeySequence(value = "teaching_seq")
public class Teaching implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TEACHING_ID",type = IdType.INPUT)
    private int teachingId;

    @TableField("BEGIN_DATE")
    private Date beginDate;

    @TableField("END_TIME")
    private Date endTime;

    @TableField("CLASSES_ID")
    private int classesId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
