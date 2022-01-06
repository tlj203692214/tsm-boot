package com.tsm.controller;


import com.tsm.entity.Follow;
import com.tsm.service.impl.FollowServiceImpl;
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
@RequestMapping("/follow")
@CrossOrigin(maxAge = 60)
public class FollowController {
@Autowired
    private FollowServiceImpl service;

@PostMapping("/addfollow")
    public int addfollow(@RequestBody Follow follow){
    int a=service.addfollow(follow);
    return a;
}

@GetMapping("/selectfollow/{id}")
    public List<Follow> selectfollow(@PathVariable(name = "id") int id){
    List<Follow> list=service.selectfollow(id);
    return list;
}

}
