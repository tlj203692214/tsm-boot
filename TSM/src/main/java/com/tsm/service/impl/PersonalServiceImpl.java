package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Personal;
import com.tsm.mapper.PersonalMapper;
import com.tsm.service.IPersonalService;
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
public class PersonalServiceImpl extends ServiceImpl<PersonalMapper, Personal> implements IPersonalService {

}
