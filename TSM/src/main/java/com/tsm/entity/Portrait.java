package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

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
@ApiModel(value="Portrait对象", description="")
@KeySequence(value = "portrait_seq")
public class Portrait implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PORTRAIT_ID",type = IdType.INPUT)
    private int portraitId;

    @TableField("PORTRAIT_URL")
    private String portraitUrl;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
