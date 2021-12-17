package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Transferrecord对象", description="")
public class Transferrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("TRANSFERRECORD_ID")
    private BigDecimal transferrecordId;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("TRANSFERRECORD_STATE")
    private BigDecimal transferrecordState;

    @TableField("CLASSES_ONE")
    private BigDecimal classesOne;

    @TableField("CLASSES_TWO")
    private BigDecimal classesTwo;

    @TableField("TRANSFERRECORD_DATE")
    private LocalDateTime transferrecordDate;

    @TableField("TRANSFERRECORD_REASON")
    private String transferrecordReason;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
