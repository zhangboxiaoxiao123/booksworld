package com.books.po;

public class Cartlist {
    private Integer cnum;

    private Float cprice;

    private String cname;
    
    private Integer cid;

    private Integer uid;

    public Integer getCnum() {
        return cnum;
    }

    public void setCnum(Integer cnum) {
        this.cnum = cnum;
    }

    public Float getCprice() {
        return cprice;
    }

    public void setCprice(Float cprice) {
        this.cprice = cprice;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
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