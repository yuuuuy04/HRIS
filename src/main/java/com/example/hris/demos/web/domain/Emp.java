package com.example.hris.demos.web.domain;


import com.baomidou.mybatisplus.annotation.TableId;

public class Emp {
    @TableId
    private Integer number;
    private Integer depno;
    private String sta;
    private String name;
    private String phnum;

    public Emp(Integer number, Integer depno, String sta, String name, String phnum) {
        this.number = number;
        this.depno = depno;
        this.sta = sta;
        this.name = name;
        this.phnum = phnum;
    }

    public Integer getnumber() {
        return number;
    }

    public void setnumber(Integer number) {
        this.number = number;
    }

    public Integer getDepno() {
        return depno;
    }

    public void setDepno(Integer depno) {
        this.depno = depno;
    }

    public String getSta() {
        return sta;
    }

    public void setSta(String sta) {
        this.sta = sta;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhnum() {
        return phnum;
    }

    public void setPhnum(String phnum) {
        this.phnum = phnum;
    }

    @Override
    public String toString() {
        return "emp{" +
                "number=" + number +
                ", depno=" + depno +
                ", sta='" + sta + '\'' +
                ", name='" + name + '\'' +
                ", phnum='" + phnum + '\'' +
                '}';
    }
}
