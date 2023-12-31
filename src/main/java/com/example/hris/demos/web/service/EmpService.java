package com.example.hris.demos.web.service;

import com.example.hris.demos.web.domain.Dep;
import com.example.hris.demos.web.domain.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> chEmp();
    public int delEmp(int id);
    public int addEmp(Emp emp);
}
