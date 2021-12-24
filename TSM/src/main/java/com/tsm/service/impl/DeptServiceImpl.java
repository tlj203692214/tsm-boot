package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Dept;
import com.tsm.mapper.DeptMapper;
import com.tsm.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        wrapper.like("DEPT_NAME",it);
        Page<Dept> page1 = new Page<>(page,size);
        IPage<Dept> iPage = deptMapper.selectPage(page1,wrapper);
        return iPage;
    }
}
