package com.tsm.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffleaveVo {
    private int leaveId;
    private String personalName;
    private String leaveContent;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date beginTime;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endTime;
    private int leaveState;
    private int staffId1;
    private int staffId2;
}
