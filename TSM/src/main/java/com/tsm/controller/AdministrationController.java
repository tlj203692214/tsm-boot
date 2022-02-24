package com.tsm.controller;


import com.tsm.service.IAdministrationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/administration")
public class AdministrationController {
    @Autowired
    private IAdministrationService service;
    @PostMapping("/upAdministration/{staffid}")
    public int updateAdmin(@PathVariable("staffid") int staffid){
        int upadmin = service.updateAdmin(staffid);
        if (upadmin>0){
            log.debug("修改成功！");
        }else{
            log.debug("修改失败！");
        }
        return upadmin;
    }
}
