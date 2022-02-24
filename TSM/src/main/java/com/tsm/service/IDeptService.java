package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Dept;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */

public interface IDeptService extends IService<Dept> {
    public IPage<Dept> findDepts(String it, int page, int size,int pid);
    public List<Dept> updateDept(@RequestBody Dept dept);
    public int delDept(int deptid);
    public int upDept(@RequestBody Dept dept);
    public int addDept(Dept dept);
    public List<Dept> ListDept();
    //通过员工id查询部门
    public List<Dept>  selectDept(int staffId);
    //查询多级部门
    public List<Dept>  selectDeptlj(int staffId);
}
