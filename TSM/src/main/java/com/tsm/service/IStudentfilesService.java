package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Studentfiles;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStudentfilesService extends IService<Studentfiles> {
//添加意向学生档案
    public int addStudenfiles(Studentfiles studentfiles);
    //编辑意向学员档案
    public int updateStudenfiles(Studentfiles studentfiles);
        //意向学员流失
    public int updatestudenfileszt(Studentfiles studentfiles);
    //意向学员激活
    public int updatestudenfilesjhzt(Studentfiles studentfiles);
    //删除意向学员
    public int scselect(Studentfiles studentfiles);
    //修改意向学员状态
    public int updatestudnetzt(Studentfiles studentfiles);
}
