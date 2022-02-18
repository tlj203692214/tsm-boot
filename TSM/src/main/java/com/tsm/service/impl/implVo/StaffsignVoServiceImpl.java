package com.tsm.service.impl.implVo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.mapper.voMapper.StaffsignVoMapper;
import com.tsm.service.serviceVo.IStaffsignVoService;
import com.tsm.vo.StaffsignVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.text.DateFormat;
import java.util.Date;


@Service
public class StaffsignVoServiceImpl extends ServiceImpl<StaffsignVoMapper, StaffsignVo> implements IStaffsignVoService {

    @Autowired
    private StaffsignVoMapper voMapper;
    @Override
    public IPage<StaffsignVo> findStaffsign(String it, int page, int size) {
        Page<StaffsignVo> page1 = new Page<>(page,size);
        //在mapper手写的方法
        IPage<StaffsignVo> Ipage = voMapper.findStaffsign(null,it,page1);
        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat dateFormat = DateFormat.getDateInstance();
        String nyr = dateFormat.format(date);
        // 视图层vo的值进行了更改显示，但是数据库的状态并没有改变
        for (int i=0;i<Ipage.getRecords().size();i++){
            StaffsignVo s=Ipage.getRecords().get(i);
            String mydate = dateFormat.format(s.getSignDate());
            if (mydate.equals(nyr)){

            }else{
                s.setSignState(0);
            }
        }
        return Ipage;
    }
}
