package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

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
@ApiModel(value="Classroom对象", description="")
public class Classroom implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CLASSROOM_ID")
    private BigDecimal classroomId;

    @TableField("CLASSROOM_NAME")
    private String classroomName;

    @TableField("CALSSROOM_STATE")
    private BigDecimal calssroomState;

    @TableField("DELETED")
    private BigDecimal deleted;


}
