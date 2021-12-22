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
 * @since 2021-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Course对象", description="")
@KeySequence(value = "course_seq")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "COURSE_ID",type = IdType.INPUT)
    private BigDecimal courseId;

    @TableField("COURSE_NAME")
    private String courseName;

    @TableField("COURSE_MONEY")
    private BigDecimal courseMoney;

    @TableField("COURSE_HOUR")
    private BigDecimal courseHour;

    @TableField("COURSE_PRICE")
    private BigDecimal coursePrice;

    @TableField("BOOK_FEE")
    private BigDecimal bookFee;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
