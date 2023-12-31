package com.example.hris.demos.web.service.impl;

import com.example.hris.demos.web.dao.EmpMapper;
import com.example.hris.demos.web.dao.ProMapper;
import com.example.hris.demos.web.domain.Emp;
import com.example.hris.demos.web.service.DepService;
import com.example.hris.demos.web.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;


    @Override
    public List<Emp> chEmp() {
        return empMapper.selectList(null);
    }

    @Override
    public int delEmp(int id) {
        return empMapper.deleteById(id);
    }

    @Override
    public int addEmp(Emp emp) {
        return empMapper.insert(emp);
    }
}
