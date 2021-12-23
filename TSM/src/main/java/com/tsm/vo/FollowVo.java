package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.KeySequence;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="FollowVo对象", description="")
public class FollowVo {
    private BigDecimal followId;//跟进编号
    private String staffName;//员工名称跟进人
    private String channelLoc;//渠道地址
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime followDate;//跟进时间
    private String studentfilesName;//学生姓名
    private String studentfilesSex;//学生性别
    private BigDecimal studentfilesAge;//学生年龄
    private String studentfilesPhone;//联系电话
    private String courseName;//课程名字
    private String studentfilesRemarks;//备注
    private BigDecimal studentfilesState;//状态
}
