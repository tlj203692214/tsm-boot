package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Draft;
import com.tsm.entity.Send;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
public interface IDraftService extends IService<Draft> {
    //新增草稿箱
    public  int addDraft(Draft draft);
    //模糊分页查询草稿箱
    public IPage<Draft> findAllDraft(int page,int size,String name, String js,String input);
    //逻辑删除草稿箱
    public int delectDraft(Draft draft);
}
