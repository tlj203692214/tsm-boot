package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel(value="Paymoney对象", description="")
@KeySequence(value = "payMoney_seq")
public class Paymoney implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PAYMONEY_ID",type = IdType.INPUT)
    private int paymoneyId;

    @TableField("PAYMONEY_MONEY")
    private double paymoneyMoney;

    @TableField("PAYMONEY_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date paymoneyDate;

    @TableField("PAYMONEY_MODE")
    private String paymoneyMode;

    @TableField("PAYMONEY_STATE")
    private int paymoneyState;

    @TableField("COURSE_ID")
    private int courseId;

    @TableField("STAFF_ID")
    private int staffId;

//    @TableField("STUDENT_ID")
//    private int studentId;

    @TableField("PAYMONEY_STATE")
    private int paymoneyState;

    @TableField("STUDENTFILES_ID")
    private int studentfilesId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
