package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.AdminVo;

public interface IAdminVoService extends IService<AdminVo> {
    public IPage<AdminVo> findsadmins(String ri, String st, String it, int page, int size);
}
