package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Studenthonor;
import com.tsm.mapper.StudenthonorMapper;
import com.tsm.service.IStudenthonorService;
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
public class StudenthonorServiceImpl extends ServiceImpl<StudenthonorMapper, Studenthonor> implements IStudenthonorService {
    @Autowired
    private StudenthonorMapper mapper;

    @Override
    public int addstudenthon(Studenthonor studenthonor) {
        int a=mapper.insert(studenthonor);
        return a;
    }

    @Override
    public int delectry(Studenthonor studenthonor) {
        int a=mapper.updatestudent(studenthonor);
        return a;
    }
}
