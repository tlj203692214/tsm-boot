package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffPositionVo {

    private int staffId; //用户编号
    private String staffName;//用户名称
    private String staffPass;//用户密码
    private int staffState;//用户状态
    private int staffpositionId;//用户角色中间表编号
    private int positionId;//角色编号
    private String positionName;//角色名称
    private String positionCode;//角色编码
    private String positionRemark;//角色描述
    private int deleted;//是否可用
}
