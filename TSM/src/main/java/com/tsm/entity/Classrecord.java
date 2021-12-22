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
 * @since 2021-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Classrecord对象", description="")
@KeySequence(value = "classrecord_seq")
public class Classrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CLASSRECORD_ID",type = IdType.INPUT)
    private BigDecimal classrecordId;

    @TableField("CLASSES_ID")
    private BigDecimal classesId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("STUDENTATTEND_ID")
    private BigDecimal studentattendId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
