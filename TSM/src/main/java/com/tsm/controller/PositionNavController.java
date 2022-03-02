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

    @PostMapping("/insertPosAndNav/{navId}")
    public int insertPosAndNav(@PathVariable int navId,@RequestBody List<Integer> ids) {
        System.out.println(navId + "角色id");
        positionNavService.deletePosAndNav(navId);
        PositionNav positionNav = new PositionNav();
        ids.forEach(e->{
            positionNav.setNavId(e);
            positionNav.setPositionId(navId);
            positionNavService.save(positionNav);
        });
            return 1;
    }



}
