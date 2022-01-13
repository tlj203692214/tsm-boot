package com.tsm.vo;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StaffVo {
    private int staffpositionId;
    private String deptName;

    private String staffName;
    private int staffState;

    private String positionName;
    private String positionCode;
    private String positionRemark;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date positionCreated;
    private Date positionUpdated;
    private int positionState;


    private int personalId;
    private String personalName;
    private String personalSex;
    private int personalAge;
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date personalBirthday;
    private String personalIdcard;
    private String personalPhone;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date entryTime;
    private int personalState;
    private int portraitId;
    private String portraitUrl;
    private int deleted;
}
