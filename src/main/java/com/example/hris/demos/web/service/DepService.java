package com.example.hris.demos.web.service;

import com.example.hris.demos.web.domain.Dep;

import java.util.List;

public interface DepService {
    public List<Dep> chDep();
    public int delDep(int id);
    public int addDep(Dep dep);
}
