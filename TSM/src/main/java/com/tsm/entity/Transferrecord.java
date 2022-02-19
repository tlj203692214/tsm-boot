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
@ApiModel(value="Transferrecord对象", description="")
@KeySequence(value = "transferRecord_seq")
public class Transferrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "TRANSFERRECORD_ID",type = IdType.INPUT)
    private int transferrecordId;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("TRANSFERRECORD_STATE")
    private int transferrecordState;

    @TableField("CLASSES_ONE")
    private int classesOne;

    @TableField("CLASSES_TWO")
    private int classesTwo;

    @TableField("TRANSFERRECORD_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date transferrecordDate;

    @TableField("TRANSFERRECORD_REASON")
    private String transferrecordReason;

    @TableField("STAFF_ID")
    private int staffId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
