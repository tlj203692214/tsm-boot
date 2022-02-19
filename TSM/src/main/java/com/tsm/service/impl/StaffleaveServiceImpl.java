package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Staffleave;
import com.tsm.mapper.StaffleaveMapper;
import com.tsm.service.IStaffleaveService;
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
public class StaffleaveServiceImpl extends ServiceImpl<StaffleaveMapper, Staffleave> implements IStaffleaveService {

    @Autowired
    private StaffleaveMapper mapper;
    @Override
    public int addstaffleave(Staffleave staffleave) {
        int add = mapper.insert(staffleave);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }
}
