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
@ApiModel(value="Notepad对象", description="")
@KeySequence(value = "notepad_seq")
public class Notepad implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "NOTEPAD_ID",type = IdType.INPUT)
    private int notepadId;

    @TableField("NOTEPAD_THEME")
    private String notepadTheme;

    @TableField("NOTEPAD_TYPE")
    private int notepadType;

    @TableField("BEGIN_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date beginTime;

    @TableField("END_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endTime;

    @TableField("NOTEPAD_PLACE")
    private String notepadPlace;

    @TableField("NOTEPAD_CONTENT")
    private String notepadContent;

    @TableField("NOTEPAD_STATE")
    private int notepadState;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("NOTEPAD_STATE")
    private int notepadState;

    @TableField("DELETED")

    private int deleted;


}
