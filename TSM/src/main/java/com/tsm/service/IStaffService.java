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

        //员工修改个人密码
        public int updatePass(Staff staff);
}
