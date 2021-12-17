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
@ApiModel(value="Coursecorrect对象", description="")
public class Coursecorrect implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("COURSECORRECT_ID")
    private BigDecimal coursecorrectId;

    @TableField("COURSECORRECT_REMARKS")
    private String coursecorrectRemarks;

    @TableField("COURSECORRECT_DATE")
    private LocalDateTime coursecorrectDate;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
