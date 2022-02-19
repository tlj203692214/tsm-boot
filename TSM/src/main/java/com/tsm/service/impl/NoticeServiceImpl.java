package com.tsm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tsm.entity.Notice;
import com.tsm.entity.Send;
import com.tsm.mapper.NoticeMapper;
import com.tsm.service.INoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author 军
 * @since 2021-12-09
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements INoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public IPage<Notice> selectNotice(int page, int size, String zt, String js, String input) {
        QueryWrapper<Notice> wrapper = new QueryWrapper<>();
        wrapper.eq("DELETED", 0);
        wrapper.orderByDesc("NOTICE_ID");

        if (zt.equals("a")) {

        } else if (zt.equals("b")) {
            wrapper.eq("NOTICE_STATE", 0);
        } else if (zt.equals("c")) {
            wrapper.eq("NOTICE_STATE", 1);
        } else {
            wrapper.eq("NOTICE_STATE", 2);
        }
        if (js.equals("公告主题")) {
            wrapper.like("NOTICE_THEME", input);
        } else if (js.equals("部门范围")) {
            wrapper.like("DEPT_NAME", input);
        } else {

        }
        Page<Notice> page1 = new Page<>(page, size);
        IPage<Notice> sendIPage = noticeMapper.selectPage(page1, wrapper);
        return sendIPage;
    }

    @Override
    public int addNotice(Notice notice) {

        return noticeMapper.insert(notice);
    }

    @Override
    public int delectNotice(Notice notice) {
        int id = notice.getNoticeId();
        Notice notice1 = noticeMapper.selectById(id);
        notice1.setDeleted(1);
        int a = noticeMapper.updateById(notice1);
        return a;
    }

    @Override
    public int releaseNotice(Notice notice) {
        int id = notice.getNoticeId();
        Notice notice1 = noticeMapper.selectById(id);
        notice1.setNoticeState(1);
        int a = noticeMapper.updateById(notice1);
        return a;

    }

    @Override
    public int DeactivateNotice(Notice notice) {
        int id = notice.getNoticeId();
        Notice notice1 = noticeMapper.selectById(id);
        notice1.setNoticeState(2);
        int a = noticeMapper.updateById(notice1);
        return a;
    }

    @Override
    public int updateNotice(Notice notice) {

        return noticeMapper.updateById(notice);
    }

    @Override
    public IPage<Notice> selectNotices(int page, int size, String deptId) {
        System.out.println("ssssssssssssssssssssssssssssssss");
        QueryWrapper<Notice> wrapper = new QueryWrapper<>();
        wrapper.inSql("DEPT_NAME", "select DEPT_NAME from NOTICE where DEPT_NAME like '%0%' or DEPT_NAME like '%" + deptId + "%'")
                .eq("NOTICE_STATE", 1)
                .eq("DELETED", 0);
        Page<Notice> page1 = new Page<>(page, size);
        IPage<Notice> sendIPage = noticeMapper.selectPage(page1, wrapper);
        return sendIPage;
    }
}
