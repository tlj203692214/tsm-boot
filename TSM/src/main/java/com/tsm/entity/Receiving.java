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
@ApiModel(value="Receiving对象", description="")
@KeySequence(value = "receiving_seq")
public class Receiving implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "RECEIVING_ID",type = IdType.INPUT)
    private BigDecimal receivingId;

    @TableField("RECEIVING_TITLE")
    private String receivingTitle;

    @TableField("RECEIVING_CONTENT")
    private String receivingContent;

    @TableField("RECEIVING_DATE")
    private LocalDateTime receivingDate;

    @TableField("RECEIVING_STATE")
    private BigDecimal receivingState;

    @TableField("STAFF_ID1")
    private BigDecimal staffId1;

    @TableField("STAFF_ID2")
    private BigDecimal staffId2;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
