package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
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
    private Date beginTime;

    @TableField("END_TIME")
    private Date endTime;

    @TableField("NOTEPAD_PLACE")
    private String notepadPlace;

    @TableField("NOTEPAD_CONTENT")
    private String notepadContent;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
