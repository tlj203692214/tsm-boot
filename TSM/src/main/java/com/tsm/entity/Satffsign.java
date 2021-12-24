package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

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
@ApiModel(value="Satffsign对象", description="")
@KeySequence(value = "staffsign_seq")
public class Satffsign implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "SIGN_ID",type = IdType.INPUT)
    private int signId;

    @TableField("SIGN_STATE")
    private int signState;

    @TableField("SIGN_DATE")
    private Date signDate;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
