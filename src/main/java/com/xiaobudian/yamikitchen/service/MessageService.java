package com.xiaobudian.yamikitchen.service;

import com.xiaobudian.yamikitchen.domain.message.Notice;

import java.util.List;

/**
 * Created by Johnson on 2015/5/12.
 */
public interface MessageService {
    public List<Notice> getNotices(Long uid, Integer pageFrom, Integer pageSize);

    public boolean removeNotice(Long uid, Long noticeId);

    public boolean addNotice(Notice notice);
}
