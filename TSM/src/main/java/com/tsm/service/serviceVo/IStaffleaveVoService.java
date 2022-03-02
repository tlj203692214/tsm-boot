package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.StaffleaveVo;

import java.util.List;

public interface IStaffleaveVoService extends IService<StaffleaveVo> {
    public IPage<StaffleaveVo> findleaveVo(String st, String it, int page, int size);
    public List<StaffleaveVo> listStaffleaveVo();
}
