package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@ApiModel(value="Notice对象", description="")
@KeySequence(value = "NOTICE_SEQ")
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value="NOTICE_ID",type= IdType.INPUT)
    private int noticeId;

    @TableField("NOTICE_TYPE")
    private int noticeType;

    @TableField("NOTICE_THEME")
    private String noticeTheme;

    @TableField("NOTICE_CONTENT")
    private String noticeContent;

    @TableField(value="NOTICE_DATE",fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date noticeDate;

    @TableField("NOTICE_STATE")
    private int noticeState;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DEPT_NAME")
    private String deptName;

    @TableField("DELETED")
    private int deleted;


}
