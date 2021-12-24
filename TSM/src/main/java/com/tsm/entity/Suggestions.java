package com.tsm.entity;

import java.math.BigDecimal;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
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
@TableName("SUGGESTIONS")
@ApiModel(value="Suggestions对象", description="")
@KeySequence(value = "SUGGESTIONS_SEQ")
public class Suggestions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="SUGGESTIONS_ID",type= IdType.INPUT)
    private int suggestionsId;

    @TableField("SUGGESTIONS_NAME")
    private String suggestionsName;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("USER_SCOPE")
    private String userScope;

    @TableField("REMARKS")
    private String remarks;

    @TableField("DELETED")
    private int deleted;


}
