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
@ApiModel(value="Studenttalk对象", description="")
public class Studenttalk implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STUDENTTALK_ID")
    private BigDecimal studenttalkId;

    @TableField("STUDENTTALK_CONTENT")
    private String studenttalkContent;

    @TableField("STUDENTTALK_DATE")
    private LocalDateTime studenttalkDate;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
