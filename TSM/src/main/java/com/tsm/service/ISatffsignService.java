package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Satffsign;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface ISatffsignService extends IService<Satffsign> {
    public int updateStaffsign(@RequestBody Satffsign satffsign);
    public List<Satffsign> StaffsignList();
    public int addStaffsign(Satffsign satffsign);
    //员工出勤工作台页面刷新调用
    public Long StaffSignCount();
}
