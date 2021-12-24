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

/**
 * <p>
 * 
 * </p>
 *
 * @author 军
 * @since 2021-12-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("OPINION")
@ApiModel(value="Opinion对象", description="")
@KeySequence(value = "OPINION_SEQ")
public class Opinion implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="OPINION_ID", type=IdType.INPUT)
    private int opinionId;

    @TableField("OPINION_TITLE")
    private String opinionTitle;

    @TableField("OPINION_CONTENT")
    private String opinionContent;

    @TableField("SUGGESTIONS_ID")
    private BigDecimal suggestionsId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField(value="PUBLICATION_TIME",fill = FieldFill.INSERT)

    @JsonFormat(pattern = "yyyy-MM-dd-HH-mm-ss")
    private Date publicationTime;

    @TableField("RESPONDENT")
    private String respondent;

    @TableField(value="REPLY_TIME",fill=FieldFill.UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd-HH-mm-ss")
    private Date replyTime;

    @TableField("DELETED")
    private int deleted;


}
