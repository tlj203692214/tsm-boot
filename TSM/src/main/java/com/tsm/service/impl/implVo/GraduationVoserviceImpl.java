package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.GraduationVoMapper;
import com.tsm.service.serviceVo.GraduationVoService;
import com.tsm.vo.GraduationVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GraduationVoserviceImpl extends ServiceImpl<GraduationVoMapper, GraduationVo> implements GraduationVoService {
    @Autowired
    private GraduationVoMapper graduationVoMapper;
    @Override
    public IPage<GraduationVo> fyselect(int page, int size) {
        Page<GraduationVo> iPage=new Page<>(page,size);
        QueryWrapper<GraduationVo> wrapper=new QueryWrapper<>();
        wrapper.orderByDesc("gra.GRADUATION_ID");
        IPage<GraduationVo> iPage1=graduationVoMapper.selectPayMoneyVo(iPage,wrapper);
        return iPage1;
    }

    @Override
    public IPage<GraduationVo> mohuselect(int page, int size, String xsname, String bj) {
        Page<GraduationVo> page1=new Page<>(page,size);
        QueryWrapper<GraduationVo> wrapper=new QueryWrapper<>();
        if (xsname != null && xsname.length() != 0) {
            wrapper.like("sta.STUDENT_NAME", xsname);
        } else {
            log.debug(xsname + "xsname是空");
        }
        if (bj != null && bj.length() != 0) {
            wrapper.eq("cla.CLASSES_ID", bj);
        } else {
            log.debug(bj + "bj是空");
        }
        IPage<GraduationVo> iPage=graduationVoMapper.selectPayMoneyVo(page1,wrapper);
        return iPage;
    }

    @Override
    public IPage<GraduationVo> moselect(int page, int size, String xsname, String bj) {
        Page<GraduationVo> page1=new Page<>(page,size);
        QueryWrapper<GraduationVo> wrapper=new QueryWrapper<>();
        if (xsname != null && xsname.length() != 0) {
            wrapper.like("cla.CLASSES_NAME", xsname);
        } else {
            log.debug(xsname + "xsname是空");
        }
        if (bj != null && bj.length() != 0) {
            wrapper.eq("cla.CLASSES_ID", bj);
        } else {
            log.debug(bj + "bj是空");
        }
        IPage<GraduationVo> iPage=graduationVoMapper.selectPayMoneyVo(page1,wrapper);
        return iPage;
    }
}
