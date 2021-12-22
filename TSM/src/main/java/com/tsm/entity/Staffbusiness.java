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
@ApiModel(value="Staffbusiness对象", description="")
@KeySequence(value = "staffBusiness_seq")
public class Staffbusiness implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STAFFBUSINESS_ID",type = IdType.INPUT)
    private BigDecimal staffbusinessId;

    @TableField("STAFFBUSINESS_CONTENT")
    private String staffbusinessContent;

    @TableField("BEGIN_TIME")
    private LocalDateTime beginTime;

    @TableField("END_TIME")
    private LocalDateTime endTime;

    @TableField("STAFFBUSINESS_STATE")
    private BigDecimal staffbusinessState;

    @TableField("STAFF_ID1")
    private BigDecimal staffId1;

    @TableField("STAFF_ID2")
    private BigDecimal staffId2;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
