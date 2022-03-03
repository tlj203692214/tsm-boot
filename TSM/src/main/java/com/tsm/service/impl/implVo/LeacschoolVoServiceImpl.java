package com.tsm.service.impl.implVo;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.LeacschoolVoMapper;
import com.tsm.service.serviceVo.LeacschoolVoService;
import com.tsm.vo.LeaceschoolVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LeacschoolVoServiceImpl extends ServiceImpl<LeacschoolVoMapper, LeaceschoolVo> implements LeacschoolVoService {
    @Autowired
    private LeacschoolVoMapper mapper;

    @Override
    public IPage<LeaceschoolVo> seleceipage(int page, int size, String name) {
        QueryWrapper<LeaceschoolVo> wrapper=new QueryWrapper<>();
        Page<LeaceschoolVo> page1=new Page<>(page,size);
        if(name!=null&&name.length()!=0){
            wrapper.like("stu.STUDENT_NAME",name);
        }
        wrapper.eq("ref.DELETED",0);
        wrapper.orderByDesc("ref.REFUND_ID");
        IPage<LeaceschoolVo> iPage=mapper.selectpage(page1,wrapper);
        return iPage;
    }
}
