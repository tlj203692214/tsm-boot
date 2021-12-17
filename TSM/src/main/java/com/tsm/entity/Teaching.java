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
@ApiModel(value="Teaching对象", description="")
public class Teaching implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("TEACHING_ID")
    private BigDecimal teachingId;

    @TableField("BEGIN_DATE")
    private LocalDateTime beginDate;

    @TableField("END_TIME")
    private LocalDateTime endTime;

    @TableField("DELETED")
    private BigDecimal deleted;


}
