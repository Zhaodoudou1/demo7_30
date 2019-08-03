package com.zdd.consulclient.server;

import com.github.pagehelper.PageInfo;
import com.zdd.consulclient.entity.Essay;

public interface EssayServer {
    PageInfo<Essay> selectAll(Integer pageNum, Integer pageSize, String like, String start, String end);

    void insertOne(Essay essay);
}
