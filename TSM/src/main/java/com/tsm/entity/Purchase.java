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
@ApiModel(value="Purchase对象", description="")
@KeySequence(value = "purchase_seq")
public class Purchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PURCHASE_ID",type = IdType.INPUT)
    private int purchaseId;

    @TableField("PURCHASE_NAME")
    private String purchaseName;

    @TableField("PURCHASE_NUMBER")
    private int purchaseNumber;

    @TableField("PURCHASE_PRICE")
    private Double purchasePrice;

    @TableField("PURCHASE_AOUNT")
    private Double purchaseAount;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("COURSE_ID")
    private int courseId;

    @TableField("PURCHASE_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date purchaseDate;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
