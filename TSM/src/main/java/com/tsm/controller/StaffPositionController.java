package com.tsm.controller;


import com.tsm.entity.Position;
import com.tsm.entity.Staff;
import com.tsm.entity.StaffPosition;
import com.tsm.service.IPositionService;
import com.tsm.service.IStaffPositionService;
import com.tsm.service.IStaffService;
import com.tsm.service.serviceVo.StaffVoService;
import com.tsm.vo.StaffVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/staff-position")
@CrossOrigin(maxAge = 60)
public class StaffPositionController {
    @Autowired
    private IStaffPositionService staffPositionService;
    @Autowired
    private StaffVoService staffVoService;

    //    添加用户权限关联表
    @PostMapping("/insertStaffPosition/{userId}")
    public int insertStaffPos(@PathVariable int userId,@RequestBody List<Integer> ids) {
        System.out.println(userId+"用户id");
        System.out.println(ids+"角色id");
        StaffPosition staffPosition = new StaffPosition();
        if(ids.size()<=0){
            staffPositionService.deletedStaffAndPos(userId);
                staffPosition.setPositionId(5);
                staffPosition.setStaffId(userId);

                staffPositionService.insertStaffPos(staffPosition);
                return 1;
        }else {
            staffPositionService.deletedStaffAndPos(userId);
            ids.forEach(e -> {
                staffPosition.setPositionId(e);
                staffPosition.setStaffId(userId);
                staffPositionService.insertStaffPos(staffPosition);
            });
            return 1;
        }


    }

    /*
     *根据用户id查询角色信息
     *
     */
    @PostMapping("/selectPosById")
    public int[] selectPosById(@RequestBody StaffPosition staffPosition) {
        return staffVoService.selectPosByStaffId(staffPosition.getStaffId());
    }
}
