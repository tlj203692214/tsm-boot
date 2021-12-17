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
@ApiModel(value="Studenthonor对象", description="")
public class Studenthonor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STUDENTHONOR_ID")
    private BigDecimal studenthonorId;

    @TableField("STUDENTHONOR_DATE")
    private LocalDateTime studenthonorDate;

    @TableField("STUDENTHONOR_CONTENT")
    private String studenthonorContent;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
