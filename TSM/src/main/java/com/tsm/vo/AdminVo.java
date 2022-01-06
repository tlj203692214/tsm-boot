package com.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
public class AdminVo {
    private Integer administrationId;
    private Integer administrationState;
    private Integer personalId;
    private Integer deptId;
    private Integer portraitId;
    private Integer positionId;
    private String portraitUrl;
    private String personalName;
    private String personalPhone;
    private String deptName;
    private String positionName;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDateTime entryTime;
}
