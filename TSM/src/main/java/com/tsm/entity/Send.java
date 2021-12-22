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
@ApiModel(value="Send对象", description="")
@KeySequence(value = "send_seq")
public class Send implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SEND_ID",type = IdType.INPUT)
    private BigDecimal sendId;

    @TableField("SEND_TITLE")
    private String sendTitle;

    @TableField("SEND_CONTENT")
    private String sendContent;

    @TableField("SEND_DATE")
    private LocalDateTime sendDate;

    @TableField("STAFF_ID1")
    private BigDecimal staffId1;

    @TableField("STAFF_ID2")
    private BigDecimal staffId2;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
