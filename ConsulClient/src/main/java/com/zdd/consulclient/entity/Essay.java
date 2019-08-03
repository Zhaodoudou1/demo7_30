package com.zdd.consulclient.entity;

import java.io.Serializable;
import java.sql.Date;


public class Essay implements Serializable {

    int eid;
    String ename;
    String econtent;
    String imgUrl;
    Date currentTime;


    public Essay() {
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setEcontent(String econtent) {
        this.econtent = econtent;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public int getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getEcontent() {
        return econtent;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public Date getCurrentTime() {
        return currentTime;
    }
}
