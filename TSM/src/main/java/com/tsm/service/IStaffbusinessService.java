package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Staffbusiness;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStaffbusinessService extends IService<Staffbusiness> {
    public IPage<Staffbusiness> findbusiness(String st, int page, int size);
    public int addstaffbusiness(Staffbusiness staffbusiness);
    public List<Staffbusiness> listStaffbusiness();
    public int upStaffbusiness(Staffbusiness staffbusiness);
    public int delstaffbusiness(int bid);
}
