package com.tsm.vo;
import lombok.Data;
import java.util.Date;

@Data
public class positionNavVo {
    private int positionmenuId;
    private int positionId;
    private String positionName;
    private String positionRemark;
    private Date positionCreated;
    private Date positionUpdated;
    private int positionState;
    private int navigationId;
    private String navigationName;
    private int navigationPid;
    private String navigationUrl;
    private String navigationIcon;
}
