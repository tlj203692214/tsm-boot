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
@ApiModel(value="Studentattend对象", description="")
public class Studentattend implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("STUDENTATTEND_ID")
    private BigDecimal studentattendId;

    @TableField("STUDENTATTEND_TYPE")
    private BigDecimal studentattendType;

    @TableField("STUDENT_ID")
    private BigDecimal studentId;

    @TableField("DELETED")
    private BigDecimal deleted;


}
