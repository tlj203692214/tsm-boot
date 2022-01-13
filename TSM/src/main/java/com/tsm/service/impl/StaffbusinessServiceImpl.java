package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Staffbusiness;
import com.tsm.mapper.StaffbusinessMapper;
import com.tsm.service.IStaffbusinessService;
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
public class StaffbusinessServiceImpl extends ServiceImpl<StaffbusinessMapper, Staffbusiness> implements IStaffbusinessService {
    @Autowired
    private StaffbusinessMapper mapper;
    @Override
    public IPage<Staffbusiness> findbusiness(String st, int page, int size) {
        Page<Staffbusiness> page1 = new Page<>(page,size);
        QueryWrapper<Staffbusiness> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED",0);
        if (st.equals("1")){

        }else if (st.equals("2")){
            wrapper.isNull("STAFF_ID2");
        }else if(st.equals("3")){
            wrapper.isNotNull("STAFF_ID2");
            wrapper.eq("STAFFBUSINESS_STATE",1);
        }else if(st.equals("4")){
            wrapper.isNotNull("STAFF_ID2");
            wrapper.eq("STAFFBUSINESS_STATE",0);
        }
        IPage<Staffbusiness> iPage = mapper.selectPage(page1,wrapper);
        return iPage;
    }
}
