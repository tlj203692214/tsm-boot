package com.tsm.vo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.regex.Pattern;

@Data
public class RefundVo {
    private BigDecimal refundId;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime refundDate;
    private Double refundMoney;
    private BigDecimal refundState;
    private String classesName;
    private String studentName;
    private String courseName;
    private Double courseMoney;
    private Double courseHour;
    private Double coursePrice;
    private Double bookFee;
    private String staffName;
    private BigDecimal deleted;
}
