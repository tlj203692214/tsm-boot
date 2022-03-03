package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.vo.LeaceschoolVo;

public interface LeacschoolVoService extends IService<LeaceschoolVo> {
public IPage<LeaceschoolVo> seleceipage(int page,int size,String name);
}
