package com.tsm.controller.controllerVo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Staff;
import com.tsm.mapper.StaffMapper;
import com.tsm.service.IStaffService;
import com.tsm.service.serviceVo.StaffVoService;
import com.tsm.vo.StaffVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Slf4j
@RestController
@CrossOrigin(maxAge = 60)
@RequestMapping("/staffVo")
public class StaffVoController {
    @Autowired
    private StaffVoService staffVoService;

    /**
     * 查询所有的用户
     */
    @GetMapping("/selectStaffVoAll")
    public IPage<StaffVo> selectStaffVoAll(@RequestParam("currentPage")int page,
           @RequestParam("pagesize")int size,@RequestParam("userName")String perName){
        return staffVoService.selectStaffVoAll(page, size,perName);
    }

    /**
     * 修改用户信息
     */
    @PostMapping("/updateStaffVo")
    public int updateStaffVo(@RequestBody StaffVo staffVo){
        return staffVoService.updateStaffVo(staffVo);
    }

    /**
     * 根据用户id查询角色
     */
    @PostMapping("/selectPosById")
    public int[] selectPosById(@RequestBody StaffVo staffVo){
        return staffVoService.selectPosByStaffId(staffVo.getStaffId());
    }

}
