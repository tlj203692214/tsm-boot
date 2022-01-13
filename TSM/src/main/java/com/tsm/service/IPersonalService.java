package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Personal;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IPersonalService extends IService<Personal> {
    public int addpersonal(Personal personal);
    public IPage<Personal> findPersonals(String it, int page, int size);
    public List<Personal> findPersonals();
    public int updatePersonal(Personal personal);
}
