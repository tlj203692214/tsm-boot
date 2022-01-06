package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Stafffiles;
import com.tsm.mapper.StafffilesMapper;
import com.tsm.service.IStafffilesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class StafffilesServiceImpl extends ServiceImpl<StafffilesMapper, Stafffiles> implements IStafffilesService {
    @Autowired
    private StafffilesMapper mapper;

    @Override
    public IPage<Stafffiles> findStafffs(String st, String it, int page, int size) {
        QueryWrapper<Stafffiles> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        if (st.equals("1")){
            wrapper.like("STAFFFILES_NAME",it);
        }else if (st.equals("2")){
            wrapper.like("STAFFFILES_PHONE",it);
        }else if (st.equals("3")){
            wrapper.like("STAFFFILES_POSITION",it);
        }
        Page<Stafffiles> page1 = new Page<>(page,size);
        IPage<Stafffiles> IPage = mapper.selectPage(page1,wrapper);
        return IPage;
    }

    @Override
    public int addStafffiles(Stafffiles stafffiles) {
        int add = mapper.insert(stafffiles);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }
}
