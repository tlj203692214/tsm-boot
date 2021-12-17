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
@ApiModel(value="Graduation对象", description="")
public class Graduation implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("GRADUATION_ID")
    private BigDecimal graduationId;

    @TableField("GRADUATION_DATE")
    private LocalDateTime graduationDate;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
