package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Position;
import com.tsm.service.IPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@RestController
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private IPositionService positionService;

    @GetMapping("/selectPosition")
    public IPage<Position> selectPosition(@RequestParam("currentPage")int size,
          @RequestParam("pagesize")int page,@RequestParam("posName")String name){

        return positionService.selectPosition(size, page,name);
    }

}
