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
@ApiModel(value="Stundentpunish对象", description="")
@KeySequence(value = "stundentPunish_seq")
public class Stundentpunish implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUNDENTPUNISH_ID",type = IdType.INPUT)
    private int stundentpunishId;

    @TableField("STUNDENTPUNISH_GRADE")
    private int stundentpunishGrade;

    @TableField("STUNDENTPUNISH_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date stundentpunishDate;

    @TableField("STUNDENTPUNISH_REASON")
    private String stundentpunishReason;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
