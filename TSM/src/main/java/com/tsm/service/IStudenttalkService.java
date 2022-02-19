package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Studenttalk;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStudenttalkService extends IService<Studenttalk> {
    //添加谈话
    public int addstudenttalk(Studenttalk studenttalk);

    //删除谈话
    public int delectstudenttalk(Studenttalk studenttalk);
}
