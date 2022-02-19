package com.tsm.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Position;
import com.tsm.service.IPositionService;
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
@RestController
@RequestMapping("/position")
@CrossOrigin(maxAge = 60)
public class PositionController {

    @Autowired
    private IPositionService positionService;

    /**
     * 分页查询所有的角色
     */
    @GetMapping("/selectPosition")
    public IPage<Position> selectPosition(@RequestParam("currentPage")int size,
          @RequestParam("pagesize")int page,@RequestParam("posName")String name){

        return positionService.selectPosition(size, page,name);
    }

    /**
     * 查询所有的角色
     */
    @GetMapping("/selectPositionAll")
    public List<Position> selectPositionAll(){
        return positionService.selectPositionAll();
    }

    /**
     * 添加角色
     */
    @PostMapping("/insertPosition")
    public int insertPosition(@RequestBody Position position){
        return positionService.insertPosition(position);
    }

    /**
     * 修改角色
     */
    @PostMapping("/updatePosition")
    public int updatePosition(@RequestBody Position position){
        System.out.println(position+"前台的数据");
        return positionService.updatePosition(position);
    }

}
