package com.books.po;

import java.util.Date;

public class Commentlist {
    private Integer pid;

    private Date pdate;

    private Date prdate;

    private Integer cid;

    private Integer uid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Date getPrdate() {
        return prdate;
    }

    public void setPrdate(Date prdate) {
        this.prdate = prdate;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}