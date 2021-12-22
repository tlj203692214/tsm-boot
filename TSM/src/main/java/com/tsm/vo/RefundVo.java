package com.tsm.vo;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RefundVo {
    private int refundId;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private LocalDateTime refundDate;
    private Double refundMoney;
    private int refundState;
    private String classesName;
    private String studentName;
    private String courseName;
    private Double courseMoney;
    private Double courseHour;
    private Double coursePrice;
    private Double bookFee;
    private String staffName;
    @TableLogic
    private BigDecimal deleted;
}
