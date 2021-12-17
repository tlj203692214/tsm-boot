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
@ApiModel(value="Studentleave对象", description="")
public class Studentleave implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STUDENTLEAVE_ID")
    private BigDecimal studentleaveId;

    @TableField("STUDENTLEAVE_STARTIME")
    private LocalDateTime studentleaveStartime;

    @TableField("STUDENTLEAVE_ENDTIME")
    private LocalDateTime studentleaveEndtime;

    @TableField("STUDENTLEAVE_REASON")
    private String studentleaveReason;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
