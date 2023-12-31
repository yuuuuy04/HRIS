package com.example.hris.demos.web.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

public class Dep {
    @TableId
    private Integer depno;
    private String depname;

    public Dep(Integer depno, String depname) {
        this.depno = depno;
        this.depname = depname;
    }

    public Integer getdepno() {
        return depno;
    }

    public void setdepno(Integer depno) {
        this.depno = depno;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    @Override
    public String toString() {
        return "dep{" +
                "depno=" + depno +
                ", depname='" + depname + '\'' +
                '}';
    }
}
