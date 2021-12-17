package com.tsm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Send;
import com.tsm.mapper.SendMapper;
import com.tsm.service.ISendService;
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
public class SendServiceImpl extends ServiceImpl<SendMapper, Send> implements ISendService {

}
