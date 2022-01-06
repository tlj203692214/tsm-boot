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
    public  int addDraft(@RequestBody Draft draft);
    //模糊分页查询草稿箱
    public IPage<Draft> findAllDraft(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("StaffNames") String name, @RequestParam("js") String js, @RequestParam("input") String input);
    //逻辑删除草稿箱
    public int delectDraft(@RequestBody Draft draft);
}
