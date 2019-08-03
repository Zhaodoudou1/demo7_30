package com.zdd.consulclient.server.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zdd.consulclient.dao.EssayDao;
import com.zdd.consulclient.entity.Essay;
import com.zdd.consulclient.server.EssayServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class EssayServerImpl implements EssayServer {

//修改测试
        @Autowired
   private EssayDao essayDao;

    @Override
    public PageInfo<Essay> selectAll(Integer pageNum, Integer pageSize, String like, String start, String end) {
        PageHelper.startPage(pageNum,pageSize);

        List<Essay> essays = essayDao.selectAll(like, start, end);
        PageInfo<Essay> info = new PageInfo<>(essays);
        return info;
    }

    @Override
    public void insertOne(Essay essay) {
        essayDao.insertOne(essay);
    }
}
