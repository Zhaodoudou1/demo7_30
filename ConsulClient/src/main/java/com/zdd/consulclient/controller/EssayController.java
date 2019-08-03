package com.zdd.consulclient.controller;

import com.github.pagehelper.PageInfo;
import com.zdd.consulclient.entity.Essay;
import com.zdd.consulclient.server.EssayServer;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@CrossOrigin
public class EssayController {

        @Autowired
        private EssayServer essayServer;

        String url;
        String file;
        @RequestMapping("selectAll")
    public PageInfo<Essay> selectAll(@RequestParam(value = "pageNum",defaultValue = "0")Integer pageNum,
                                     @RequestParam(value = "pageSize",defaultValue = "3")Integer pageSize,
                                     @RequestParam(value = "like",defaultValue = "")String like,
                                     @RequestParam(value = "satrt",defaultValue = "1000-01-01")String start,
                                     @RequestParam(value = "end",defaultValue = "3000-12-12")String end
                                     ){

            PageInfo<Essay> essayPageInfo = essayServer.selectAll(pageNum, pageSize, like, start, end);

            return essayPageInfo;
        }

        @RequestMapping("imgUrl")
        public  void imgUrl(@Param("file")MultipartFile file) throws IOException {
                file.transferTo(new File("F:\\Photo\\"+file.getOriginalFilename()));
            url = file.getOriginalFilename();
        }

        @RequestMapping("insertOne")
    public int insertOne(@RequestBody Essay essay){
            essay.setImgUrl(url);
            essayServer.insertOne(essay);

            return 1;
        }
}
