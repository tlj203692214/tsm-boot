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
@ApiModel(value="Notice对象", description="")
@KeySequence(value = "notice_seq")
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "NOTICE_ID",type = IdType.INPUT)
    private BigDecimal noticeId;

    @TableField("NOTICE_TYPE")
    private BigDecimal noticeType;

    @TableField("NOTICE_THEME")
    private String noticeTheme;

    @TableField("NOTICE_CONTENT")
    private String noticeContent;

    @TableField("NOTICE_DATE")
    private LocalDateTime noticeDate;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    @TableLogic
    private BigDecimal deleted;


}
