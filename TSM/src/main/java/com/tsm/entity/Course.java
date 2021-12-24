package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;


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
    private int courseId;

    @TableField("COURSE_NAME")
    private String courseName;

    @TableField("COURSE_MONEY")
    private Double courseMoney;

    @TableField("COURSE_HOUR")
    private int courseHour;

    @TableField("COURSE_PRICE")
    private Double coursePrice;

    @TableField("BOOK_FEE")
    private int bookFee;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
