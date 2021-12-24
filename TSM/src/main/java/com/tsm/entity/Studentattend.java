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
@ApiModel(value="Studentattend对象", description="")
@KeySequence(value = "studentAttend_seq")
public class Studentattend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENTATTEND_ID",type = IdType.INPUT)
    private int studentattendId;

    @TableField("STUDENTATTEND_TYPE")
    private int studentattendType;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
