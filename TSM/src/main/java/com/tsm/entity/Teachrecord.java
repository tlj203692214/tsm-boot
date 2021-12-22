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
@ApiModel(value="Teachrecord对象", description="")
@KeySequence(value = "teachrecord_seq")
public class Teachrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TEACHRECORD_ID",type = IdType.INPUT)
    private BigDecimal teachrecordId;

    @TableField("TEACHRECORD_DATE")
    private LocalDateTime teachrecordDate;

    @TableField("TEACHING_ID")
    private BigDecimal teachingId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
