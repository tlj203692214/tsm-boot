package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Dept;
import com.tsm.mapper.DeptMapper;
import com.tsm.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public IPage<Dept> findDepts(String it, int page, int size) {
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        wrapper.eq("DEPT_DID",0);
        wrapper.like("DEPT_NAME",it);
        wrapper.orderByDesc("DEPT_ID");
        Page<Dept> page1 = new Page<>(page,size);
        IPage<Dept> iPage = deptMapper.selectPage(page1,wrapper);
        return iPage;
    }

    @Override
    public List<Dept> updateDept(Dept dept) {
        List<Dept> list = deptMapper.selectList(null);
        return list;
    }

    @Override
    public int delDept(int deptid) {
        Dept dept = deptMapper.selectById(deptid);
        dept.setDeleted(1);
        int del = deptMapper.updateById(dept);
        if (del > 0) {
            log.debug("删除成功" + dept.getDeleted());
        } else {
            log.debug("删除失败");
        }
        return del;
    }

    @Override
    public int upDept(Dept dept) {
        int id = dept.getDeptId();
        String name = dept.getDeptName();
        Dept dept1 = deptMapper.selectById(id);
        dept1.setDeptName(name);
        int update = deptMapper.updateById(dept1);
        if (update > 0) {
            log.debug("修改部门成功" + dept1.getDeptName());
        } else {
            log.debug("修改部门失败");
        }
        return update;
    }

    @Override
    public int addDept(Dept dept) {
        String name = dept.getDeptName();
        int did = dept.getDeptDid();
        Dept dept1 = new Dept();
        dept1.setDeptName(name);
        dept1.setDeptDid(did);
        int insert = deptMapper.insert(dept1);
        if (insert > 0) {
            log.debug("新增部门成功");
        } else {
            log.debug("新增部门失败");
        }
        return insert;
    }

    @Override
    public List<Dept> ListDept() {
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        List<Dept> list = deptMapper.selectList(wrapper);
        return list;
    }

    @Override
    public List<Dept> selectDept(int staffId) {
        List<Dept> list = deptMapper.selectDept(staffId);
        return list;
    }

    @Override
    public List<Dept> selectDeptlj(int staffId) {
        QueryWrapper<Dept> wrapper = new QueryWrapper<>();
        wrapper.eq("DEPT_DID", staffId);
        List<Dept> list = deptMapper.selectList(wrapper);
        return list;
    }

}
