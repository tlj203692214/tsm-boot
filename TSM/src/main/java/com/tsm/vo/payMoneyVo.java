package com.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class payMoneyVo {
    private BigDecimal paymoneyId;
    private Double paymoneyMoney;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime paymoneyDate;
    private String paymoneyMode;
    private String courseName;
    private Double courseMoney;
    private Double courseHour;
    private Double coursePrice;
    private Double bookFee;
    private String staffName;
    private String studentName;

}
