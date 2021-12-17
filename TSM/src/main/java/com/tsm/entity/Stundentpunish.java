package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class Stundentpunish implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STUNDENTPUNISH_ID")
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
    private BigDecimal deleted;


}
