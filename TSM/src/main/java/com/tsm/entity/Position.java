package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

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
@ApiModel(value="Position对象", description="")
@KeySequence(value = "position_seq")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "POSITION_ID",type = IdType.INPUT)
    private int positionId;

    @TableField("POSITION_NAME")
    private String positionName;

    @TableField("POSITION_REMARK")
    private String positionRemark;

    @TableField(value = "POSITION_CREATED",fill = FieldFill.INSERT)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date positionCreated;

    @TableField(value = "POSITION_UPDATED",fill = FieldFill.INSERT_UPDATE)
    @JsonFormat(pattern = "YYYY-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date positionUpdated;

    @TableField("POSITION_STATE")
    private int positionState;

    @TableField("DEPT_ID")
    private int deptId;

    @TableField("DELETED")
    @TableLogic
    private int deleted;


}
