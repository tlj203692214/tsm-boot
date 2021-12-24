package com.tsm.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 * 
 * </p>
 *
 * @author 军
 * @since 2021-12-14
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SENDANDRECEIVING")
@ApiModel(value="Sendandreceiving对象", description="")
@KeySequence(value = "SANDR_SEQ")
public class Sendandreceiving implements Serializable {
    private static final long serialVersionUID = 1L;

    @TableId(value="SANDR_ID", type = IdType.INPUT)
    private int sandrId;

    @TableField("STAFFNAME2")
    private String staffName2;

    @TableField("SANDR_STATE")
    private String sandrState="未读";

    @TableField(value="SANDR_DATE",fill = FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd-HH-mm-ss")
    private Date sandrDate;

    @TableField("SEND_ID")
    private int sendId;


}
