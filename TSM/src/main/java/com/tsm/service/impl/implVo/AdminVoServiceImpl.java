package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.AdminVoMapper;
import com.tsm.service.serviceVo.IAdminVoService;
import com.tsm.vo.AdminVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminVoServiceImpl extends ServiceImpl<AdminVoMapper, AdminVo> implements IAdminVoService {
    @Autowired
    private AdminVoMapper voMapper;

    @Override
    public IPage<AdminVo> findsadmins(String st, String it, int page, int size) {
        Page<AdminVo> page1 = new Page<>(page,size);
        QueryWrapper wrapper = new QueryWrapper();
        if (st.equals("1")){
            wrapper.like("PERSONAL_NAME",it);
        }else if (st.equals("2")){
            wrapper.like("PERSONAL_PHONE",it);
        }else if (st.equals("3")){
            wrapper.like("POSITION_NAME",it);
        }
        IPage<AdminVo> iPage = voMapper.findsAdmins(page1,wrapper);
        return iPage;
    }
}
