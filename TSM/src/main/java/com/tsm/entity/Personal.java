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
@ApiModel(value="Personal对象", description="")
@KeySequence(value = "personal_seq")
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "PERSONAL_ID",type = IdType.INPUT)
    private int personalId;

    @TableField("PERSONAL_NAME")
    private String personalName;

    @TableField("PERSONAL_SEX")
    private String personalSex;

    @TableField("PERSONAL_AGE")
    private int personalAge;

    @TableField("PERSONAL_BIRTHDAY")
    private Date personalBirthday;

    @TableField("PERSONAL_IDCARD")
    private String personalIdcard;

    @TableField("PERSONAL_PHONE")
    private String personalPhone;

    @TableField("ENTRY_TIME")
    private Date entryTime;

    @TableField("PORTRAIT_ID")
    private int portraitId;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
