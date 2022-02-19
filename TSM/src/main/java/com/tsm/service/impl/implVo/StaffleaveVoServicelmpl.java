package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.StaffleaveVoMapper;
import com.tsm.service.serviceVo.IStaffleaveVoService;
import com.tsm.vo.StaffleaveVo;
import com.tsm.vo.StaffsignVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffleaveVoServicelmpl extends ServiceImpl<StaffleaveVoMapper,StaffleaveVo> implements IStaffleaveVoService {

    @Autowired
    private StaffleaveVoMapper voMapper;
    @Override
    public IPage<StaffleaveVo> findleaveVo(String st, String it, int page, int size) {
        Page<StaffleaveVo> page1 = new Page<>(page,size);
        QueryWrapper<StaffleaveVo> wrapper = new QueryWrapper<>();
        wrapper.eq("sl.DELETED",0);
        if (st.equals("1")){

        }else if (st.equals("2")){
            wrapper.isNull("sl.STAFF_ID2");
        }else if(st.equals("3")){
            wrapper.isNotNull("sl.STAFF_ID2");
            wrapper.eq("sl.LEAVE_STATE",1);
        }else if(st.equals("4")){
            wrapper.isNotNull("sl.STAFF_ID2");
            wrapper.eq("sl.LEAVE_STATE",0);
        }
        wrapper.like("ps.PERSONAL_NAME",it);
        IPage<StaffleaveVo> iPage = voMapper.findleaveVo(page1,wrapper);
        return iPage;
    }
}
