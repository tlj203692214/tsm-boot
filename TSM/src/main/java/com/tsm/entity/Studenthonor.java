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
@ApiModel(value="Studenthonor对象", description="")
@KeySequence(value = "studentHonor_seq")
public class Studenthonor implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "STUDENTHONOR_ID",type = IdType.INPUT)
    private int studenthonorId;

    @TableField("STUDENTHONOR_DATE")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date studenthonorDate;

    @TableField("STUDENTHONOR_CONTENT")
    private String studenthonorContent;

    @TableField("STUDENT_ID")
    private int studentId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
