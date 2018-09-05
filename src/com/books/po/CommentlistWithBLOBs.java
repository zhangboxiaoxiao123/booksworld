package com.books.po;

public class CommentlistWithBLOBs extends Commentlist {
    private String pcontent;

    private String preplay;

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent == null ? null : pcontent.trim();
    }

    public String getPreplay() {
        return preplay;
    }

    public void setPreplay(String preplay) {
        this.preplay = preplay == null ? null : preplay.trim();
    }
}