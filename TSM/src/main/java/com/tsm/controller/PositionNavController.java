package com.tsm.controller;


import com.tsm.entity.PositionNav;
import com.tsm.service.IPositionNavService;
import com.tsm.service.serviceVo.PositionNavVoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 军
 * @since 2022-02-14
 */
@RestController
@RequestMapping("/position-nav")
@CrossOrigin(maxAge = 60)
public class PositionNavController {
    @Autowired
    private IPositionNavService positionNavService;
    @Autowired
    private PositionNavVoService positionNavVoService;

    @PostMapping("/insertPosAndNav")
    public int insertPosAndNav(@RequestBody PositionNav positionNav) {
        System.out.println(positionNav + "数据");
        int[] ints = positionNavVoService.selectPosById(positionNav.getPositionId());

        for (int aa : ints) {
            if (positionNav.getNavId() == aa) {
                System.out.println(aa+"数组数据");
                return 0;
            }
        }
        return positionNavService.insertPosAndNav(positionNav);
    }

}
