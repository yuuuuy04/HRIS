package com.example.hris.demos.web.domain;

import com.baomidou.mybatisplus.annotation.TableId;

public class Pro {
    @TableId
    private Integer pno;
    private String pname;
    private Integer pnum;
    private Integer ptax;

    public Pro(Integer pno, String pname, Integer pnum, Integer ptax) {
        this.pno = pno;
        this.pname = pname;
        this.pnum = pnum;
        this.ptax = ptax;
    }

    public Integer getPno() {
        return pno;
    }

    public void setPno(Integer pno) {
        this.pno = pno;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPnum() {
        return pnum;
    }

    public void setPnum(Integer pnum) {
        this.pnum = pnum;
    }

    public Integer getPtax() {
        return ptax;
    }

    public void setPtax(Integer ptax) {
        this.ptax = ptax;
    }

    @Override
    public String toString() {
        return "pro{" +
                "pno=" + pno +
                ", pname='" + pname + '\'' +
                ", pnum=" + pnum +
                ", ptax=" + ptax +
                '}';
    }
}
