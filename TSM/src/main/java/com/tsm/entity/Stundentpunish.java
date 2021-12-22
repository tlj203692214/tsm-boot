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
@ApiModel(value="Stundentpunish对象", description="")
@KeySequence(value = "studentPunish_seq")
public class Stundentpunish implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUNDENTPUNISH_ID",type = IdType.INPUT)
    private BigDecimal stundentpunishId;

    @TableField("STUNDENTPUNISH_GRADE")
    private BigDecimal stundentpunishGrade;

    @TableField("STUNDENTPUNISH_DATE")
    private LocalDateTime stundentpunishDate;

    @TableField("STUNDENTPUNISH_REASON")
    private String stundentpunishReason;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
