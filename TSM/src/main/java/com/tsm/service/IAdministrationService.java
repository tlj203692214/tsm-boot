package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Administration;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IAdministrationService extends IService<Administration> {
    public int updateAdmin(int staffid);
    public int addAdmin(Administration administration);
}
