package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Satffsign;
import com.tsm.mapper.SatffsignMapper;
import com.tsm.service.ISatffsignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class SatffsignServiceImpl extends ServiceImpl<SatffsignMapper, Satffsign> implements ISatffsignService {

    @Autowired
    private SatffsignMapper mapper;

    @Override
    public int updateStaffsign(Satffsign satffsign) {
        int id = satffsign.getSignId();
        Satffsign s1=mapper.selectById(id);
        System.out.println("iddiididididi"+id);
        s1.setSignState(1);
        s1.setSignDate(new Date());
        int update = mapper.updateById(s1);
        if (update>0){
            System.out.println("打卡成功！");
        }else {
            System.out.println("打卡失败！");
        }
        return update;
    }
}
