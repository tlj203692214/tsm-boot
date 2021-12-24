package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.StaffsignVo;
import org.springframework.web.bind.annotation.RequestParam;

public interface IStaffsignVoService extends IService<StaffsignVo> {
    public IPage<StaffsignVo> findStaffsign(@RequestParam("input") String it, @RequestParam("currentPage") int page, @RequestParam("pagesize") int size);
}
