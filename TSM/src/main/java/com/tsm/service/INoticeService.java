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
    public IPage<Notice> updateNotice(int page,int size,String zt, String js, String input);//查询公告箱
    public int addNotice(Notice notice);   //新增公告
    public int delectNotice(Notice notice);//删除公告
    public int releaseNotice(Notice notice); //将公告箱状态改为发布
    public int DeactivateNotice(Notice notice);//将公告箱状态改为停用
    public int updateNotice(Notice notice); //修改公告箱
}
