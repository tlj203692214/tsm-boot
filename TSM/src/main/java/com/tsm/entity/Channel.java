package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

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
@ApiModel(value="Channel对象", description="")
@KeySequence(value = "channel_seq")
public class Channel implements Serializable {

    private static final long serialVersionUID = 1L;


    @TableId(value = "CHANNEL_ID",type = IdType.INPUT)
    private BigDecimal channelId;

    @TableField("CHANNEL_NAME")
    private String channelName;

    @TableField("CHANNEL_LOC")
    private String channelLoc;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
