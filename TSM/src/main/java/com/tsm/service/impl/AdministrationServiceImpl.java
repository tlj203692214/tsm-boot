package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Administration;
import com.tsm.mapper.AdministrationMapper;
import com.tsm.service.IAdministrationService;
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
public class AdministrationServiceImpl extends ServiceImpl<AdministrationMapper, Administration> implements IAdministrationService {

    @Autowired
    private AdministrationMapper mapper;
    @Override
    public int updateAdmin(int staffid) {
        Administration admin = mapper.selectById(staffid);
        if (admin.getAdministrationState()==0){
            admin.setAdministrationState(1);
            log.debug("账号修改已停用");
        }else{
            admin.setAdministrationState(0);
            log.debug("账号已恢复可用");
        }
        int update = mapper.updateById(admin);
        return update;
    }

    @Override
    public int addAdmin(Administration administration) {
        int add = mapper.insert(administration);
        return add;
    }
}
