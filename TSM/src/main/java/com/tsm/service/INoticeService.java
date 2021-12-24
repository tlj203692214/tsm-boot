package com.tsm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.tsm.entity.Notice;
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
public interface INoticeService extends IService<Notice> {
    public IPage<Notice> updateNotice(@RequestParam("currentPage") int page, @RequestParam("pagesize") int size, @RequestParam("zt") String zt, @RequestParam("js") String js, @RequestParam("input") String input);
    public int addNotice(@RequestBody Notice notice);
    public int delectNotice(@RequestBody Notice notice);
    public int releaseNotice(@RequestBody Notice notice); //将公告箱状态改为发布
    public int DeactivateNotice(@RequestBody Notice notice);//将公告箱状态改为停用
    public int updateNotice(@RequestBody Notice notice); //修改公告箱
}
