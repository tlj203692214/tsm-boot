package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * <p>
 *
 * </p>
 *
 * @author ..
 * @since 2021-12-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("SEND")
@ApiModel(value="Send对象", description="")
@KeySequence (value = "SEND_SEQ")
public class Send implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="SEND_ID",type = IdType.INPUT)
    private int sendId;

    @TableField("SEND_TITLE")
    private String sendTitle;

    @TableField("SEND_CONTENT")
    private String sendContent;


    @TableField(value ="SEND_DATE", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd-HH-mm-ss",timezone = "GMT+8")
    private Date sendDate;

    @TableField("SENDS_STATE")
    private int sendsState;

    @TableField("STAFF_NAME1")
    private String staffName1;

    @TableField("STAFF_NAME2")
    private String staffName2;



    @TableField("DELETED")
    private int deleted;

}
