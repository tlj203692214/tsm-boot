package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Studenthonor;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStudenthonorService extends IService<Studenthonor> {
    public int addstudenthon (Studenthonor studenthonor);

    public int delectry (Studenthonor studenthonor);
}
