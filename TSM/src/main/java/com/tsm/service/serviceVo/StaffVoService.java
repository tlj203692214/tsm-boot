package com.tsm.service.serviceVo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Staff;
import com.tsm.vo.StaffVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface StaffVoService extends IService<StaffVo> {
        public IPage<StaffVo> selectStaffVoAll(int page,int size,String name);
        int updateStaffVo(StaffVo staffVo);
}
