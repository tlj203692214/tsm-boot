package com.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IncomeVo {
    private int paymoneyId;
    private int paymoneyState;
    private double paymoneyMoney;
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Date paymoneyDate;
    private String paymoneyMode;
    private String studentfilesName;
    private String staffName;
    private BigDecimal deleted;
}
