package com.tsm.controller;
import com.tsm.entity.Navigation;
import com.tsm.service.INavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @GetMapping("/selectNavigation")
    public List<Navigation> selectAll(){
        List<Navigation> list = navigationService.list();
        List<Navigation> list1=new ArrayList<>();
        for (Navigation navigation : list) {
            for (Navigation navigation1 : list) {
                if(navigation.getNavigationPid()==navigation1.getNavigationId()){
                    navigation1.getChildern().add(navigation);
                }
            }
            if (navigation.getNavigationPid()==0){
                list1.add(navigation);
            }

        }
        return list1;
    }
}
