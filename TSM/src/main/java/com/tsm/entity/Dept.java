package com.tsm.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.KeySequence;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="Dept对象", description="")
@KeySequence(value = "dept_seq")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "DEPT_ID",type = IdType.INPUT)
    private int deptId;

    @TableField("DEPT_NAME")
    private String deptName;

    @TableField("DEPT_DID")
    private int deptdid;

    @TableField("DELETED")
    private int deleted;


}
