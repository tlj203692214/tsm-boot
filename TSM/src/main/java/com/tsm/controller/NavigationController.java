package com.tsm.controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.tsm.entity.Navigation;
import com.tsm.service.INavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 军
 * @since 2021-12-29
 */
@RestController
@RequestMapping("/navigation")
public class NavigationController {

    @Autowired
    private INavigationService navigationService;

    @GetMapping("/selectNavigation/{id}")
    public List<Navigation> selectAll(@PathVariable("id") int id){
        List<Navigation> list = navigationService.selectAll(id);
        List<Navigation> list1=new ArrayList<>();

        for (Navigation navigation : list) {
            for (Navigation n : list) {
                if(n.getNavigationPid()==navigation.getNavigationId()){
                    navigation.getChildern().add(n);
                }
            }
            if (navigation.getNavigationPid()==0){
                list1.add(navigation);

            }
        }
        System.out.println(list1+"权限数据");
        return list1;
    }

    /**
     * 查询所有权限菜单
     */
    @GetMapping("/selectNavigationAll")
    public IPage<Navigation> selectNavAll(@RequestParam("currentPage")int page,
           @RequestParam("pagesize")int size,@RequestParam("navName")String navName){
        return navigationService.selectNavAll(page, size,navName);
    }

    /**
     * 新增权限
     */
    @PostMapping("/insertNav")
    public int insertNav(@RequestBody Navigation navigation){
        return navigationService.insertNav(navigation);
    }

    /**
     * 查询父id
     */
    @GetMapping("/selectPid")
    public List<Navigation> selectPid(){
        return navigationService.selectPid();
    }

    /**
     * 修改权限方法
     */
    @PostMapping("/updateNav")
    public int updateNav(@RequestBody Navigation navigation){
        return navigationService.updateNav(navigation);
    }

    /*
    *删除权限方法
    */
    @PostMapping("/deleteNav")
    public int deleteNav(@RequestBody Navigation navigation){
        return navigationService.deleteNav(navigation.getNavigationId());
    }

    /**
     * 查询全部权限信息（用户角色授权查询）
     */
    @GetMapping("/selectNav")
    public List<Navigation> selectNav(){
        QueryWrapper<Navigation> queryWrapper = new QueryWrapper();
        queryWrapper
                .orderByAsc("NAVIGATION_ID");
        return navigationService.list(queryWrapper);
    }

//    权限菜单查询
    @GetMapping("/selectNavigation2")
    public List<Navigation> selectAll2(){
        List<Navigation> list = navigationService.list();
        List<Navigation> list1=new ArrayList<>();
        for (Navigation navigation : list) {
            for (Navigation n : list) {
                if(n.getNavigationPid()==navigation.getNavigationId()){
                    navigation.getChildern().add(n);
                }
            }
            if (navigation.getNavigationPid()==0){
                list1.add(navigation);
            }
        }
        return list1;
    }
}
