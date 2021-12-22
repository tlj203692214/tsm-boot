package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
@ApiModel(value="Suggestions对象", description="")
@KeySequence(value = "suggestions_seq")
public class Suggestions implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SUGGESTIONS_ID",type = IdType.INPUT)
    private BigDecimal suggestionsId;

    @TableField("SUGGESTIONS_CONTENT")
    private String suggestionsContent;

    @TableField("SUGGESTIONS_DATE")
    private LocalDateTime suggestionsDate;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
