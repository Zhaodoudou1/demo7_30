package com.zdd.consulclient.dao;

import com.zdd.consulclient.entity.Essay;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EssayDao {

    List<Essay> selectAll(@Param("like") String like,@Param("start") String start, @Param("end")String end);

    void insertOne(@Param("e") Essay essay);
}
