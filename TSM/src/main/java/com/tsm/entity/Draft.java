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
@ApiModel(value="Draft对象", description="")
@KeySequence(value = "DRAFT_SEQ")
public class Draft implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="DRAFT_ID",type= IdType.INPUT)
    private int draftId;

    @TableField("DRAFT_TITLE")
    private String draftTitle;

    @TableField("DRAFT_CONTENT")
    private String draftContent;

    @TableField(value = "DRAFT_DATE" ,fill = FieldFill.INSERT)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date draftDate;

    @TableField("STAFF_NAME1")
    private String staffName1;

    @TableField("STAFF_NAME2")
    private String staffName2;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
