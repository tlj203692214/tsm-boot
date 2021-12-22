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
@ApiModel(value="Draft对象", description="")
@KeySequence(value = "draft_seq")
public class Draft implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "DRAFT_ID",type = IdType.INPUT)
    private BigDecimal draftId;

    @TableField("DRAFT_TITLE")
    private String draftTitle;

    @TableField("DRAFT_CONTENT")
    private String draftContent;

    @TableField("DRAFT_DATE")
    private LocalDateTime draftDate;

    @TableField("STAFF_ID1")
    private BigDecimal staffId1;

    @TableField("STAFF_ID2")
    private BigDecimal staffId2;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}