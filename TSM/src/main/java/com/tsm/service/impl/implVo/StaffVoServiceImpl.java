package com.tsm.service.impl.implVo;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.StaffVoMapper;
import com.tsm.service.serviceVo.StaffVoService;
import com.tsm.vo.StaffVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
@Transactional
public class StaffVoServiceImpl extends ServiceImpl<StaffVoMapper, StaffVo> implements StaffVoService {
    @Autowired
    private StaffVoMapper staffVoMapper;

    @Override
    public IPage<StaffVo> selectStaffVoAll(int page, int size, String perName) {
        Page<StaffVo> page1 = new Page<>(page, size);
        IPage<StaffVo> staffVoIPage = staffVoMapper.selectAllStaff(page1, perName);
        return staffVoIPage;
    }

    @Override
    public int updateStaffVo(StaffVo staffVo) {
        return staffVoMapper.updateById(staffVo);
    }

    @Override
    public int[] selectPosByStaffId(int id) {
        return staffVoMapper.selectPositionByStaffId(id);
    }

    @Override
    public List<StaffVo> selectPosition(int staffId) {
        List<StaffVo> list=staffVoMapper.selectPosition(staffId);
        return  list;
    }
}
