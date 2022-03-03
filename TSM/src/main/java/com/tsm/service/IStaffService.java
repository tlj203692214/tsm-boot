package com.tsm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Staff;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IStaffService extends IService<Staff> {
        public Staff selectStaff(String staffName, String staffPass);

        //查询跟进人员工
        public List<Staff> selectstaffqudao();

        //员工辞退修改账号状态
        public int updateStaff(int staffid);

        //员工转正添加员工账号
        public int addStaff(Staff staff);

        //员工修改密码
        public  int updatePass(Staff staff);

        //将密码加密
        public  String md5(String staffPass);

        //查询所有员工工作台
        public long staffCount();

}
