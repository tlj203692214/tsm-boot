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
@TableName("RECEIVING")
@ApiModel(value="Receiving对象", description="")

public class Receiving implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="RECEIVINGS_ID",type=IdType.INPUT)
    private int receivingsId;

    @TableField("RECEIVINGS_TITLE")
    private String receivingsTitle;

    @TableField("RECEIVINGS_CONTENT")
    private String receivingsContent;

    @TableField(value="RECEIVINGS_DATE", fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date receivingsDate;

    @TableField("RECEIVINGS_STATE")
    private String receivingsState="1";

    @TableField("STAFF_NAME1")
    private String staffName1;

    @TableField("STAFF_NAME2")
    private String staffName2;

    @TableField("RECEIVING_DELETED")
    private String receivingDeleted="1";


}
