package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@ApiModel(value="Classes对象", description="")
@KeySequence(value = "classes_seq")
public class Classes implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "CLASSES_ID",type = IdType.INPUT)
    private BigDecimal classesId;

    @TableField("CLASSES_NAME")
    private String classesName;

    @TableField("CLASSES_NUMBER")
    private BigDecimal classesNumber;

    @TableField("CLASSES_DATE")
    private LocalDateTime classesDate;

    @TableField("CLASSROOM_ID")
    private BigDecimal classroomId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
