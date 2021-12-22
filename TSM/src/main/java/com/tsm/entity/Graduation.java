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
@ApiModel(value="Graduation对象", description="")
@KeySequence(value = "graduation_seq")
public class Graduation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "GRADUATION_ID",type = IdType.INPUT)
    private BigDecimal graduationId;

    @TableField("GRADUATION_DATE")
    private LocalDateTime graduationDate;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
