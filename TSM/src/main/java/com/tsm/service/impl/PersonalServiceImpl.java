package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Personal;
import com.tsm.mapper.PersonalMapper;
import com.tsm.service.IPersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
@Transactional
public class PersonalServiceImpl extends ServiceImpl<PersonalMapper, Personal> implements IPersonalService {
    @Autowired
    private PersonalMapper personalMapper;
    @Override
    public int addpersonal(Personal personal) {
        int add = personalMapper.insert(personal);
        if (add>0){
            log.debug("新增成功");
        }else{
            log.debug("新增失败");
        }
        return add;
    }

    @Override
    public int updatePersonal(Personal personal) {
        return personalMapper.updateById(personal);
    }


}
