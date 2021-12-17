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
@ApiModel(value="Correctrecord对象", description="")
public class Correctrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CORRECTRECORD_ID")
    private BigDecimal correctrecordId;

    @TableField("CORRECTRECORD_DATE")
    private LocalDateTime correctrecordDate;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("COURSECORRECT_ID")
    private BigDecimal coursecorrectId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
