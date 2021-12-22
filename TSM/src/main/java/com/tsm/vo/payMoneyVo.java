package com.tsm.vo;

import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class payMoneyVo {
    private int paymoneyId;
    private Double paymoneyMoney;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private LocalDateTime paymoneyDate;
    private int incomeId;
    private BigDecimal incomeState;
    private String paymoneyMode;
    private String courseName;
    private Double courseMoney;
    private Double courseHour;
    private Double coursePrice;
    private Double bookFee;
    private String staffName;
    private String studentName;
    @TableLogic
    private int deleted;
}
