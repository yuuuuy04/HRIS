package com.example.hris.demos.web.service;

import com.example.hris.demos.web.domain.Emp;
import com.example.hris.demos.web.domain.Pro;

import java.util.List;

public interface ProService {
    public List<Pro> chPro();
    public int delPro(int id);
    public int addPro(Pro pro);
}
