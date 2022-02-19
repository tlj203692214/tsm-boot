package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Studenttalk;
import com.tsm.mapper.StudenttalkMapper;
import com.tsm.service.IStudenttalkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class StudenttalkServiceImpl extends ServiceImpl<StudenttalkMapper, Studenttalk> implements IStudenttalkService {
    @Autowired
    private StudenttalkMapper mapper;

    @Override
    public int addstudenttalk(Studenttalk studenttalk) {
        int a=mapper.insert(studenttalk);
        return a;
    }

    @Override
    public int delectstudenttalk(Studenttalk studenttalk) {
        int a=mapper.updatestudent(studenttalk);
        return a;
    }
}
