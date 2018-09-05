package com.books.po;

public class CommoditylistWithBLOBs extends Commoditylist {
    private String cinf;

    private byte[] cpic;

    public String getCinf() {
        return cinf;
    }

    public void setCinf(String cinf) {
        this.cinf = cinf == null ? null : cinf.trim();
    }

    public byte[] getCpic() {
        return cpic;
    }

    public void setCpic(byte[] cpic) {
        this.cpic = cpic;
    }
}