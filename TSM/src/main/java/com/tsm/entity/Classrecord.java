package com.tsm.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author 军
 * @since 2021-12-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Classrecord对象", description="")
public class Classrecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("CLASSRECORD_ID")
    private BigDecimal classrecordId;

    @TableField("CLASSES_ID")
    private BigDecimal classesId;

    @TableField("COURSE_ID")
    private BigDecimal courseId;

    @TableField("STAFF_ID")
    private BigDecimal staffId;

    @TableField("STUDENTATTEND_ID")
    private BigDecimal studentattendId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
