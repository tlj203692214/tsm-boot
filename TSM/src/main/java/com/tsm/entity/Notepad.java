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
@ApiModel(value="Notepad对象", description="")
@KeySequence(value = "notepad_seq")
public class Notepad implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "NOTEPAD_ID",type = IdType.INPUT)
    private BigDecimal notepadId;

    @TableField("NOTEPAD_THEME")
    private String notepadTheme;

    @TableField("NOTEPAD_TYPE")
    private BigDecimal notepadType;

    @TableField("BEGIN_TIME")
    private LocalDateTime beginTime;

    @TableField("END_TIME")
    private LocalDateTime endTime;

    @TableField("NOTEPAD_PLACE")
    private String notepadPlace;

    @TableField("NOTEPAD_CONTENT")
    private String notepadContent;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}