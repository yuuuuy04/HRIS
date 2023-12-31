package com.example.hris.demos.web.service.impl;

import com.example.hris.demos.web.dao.ProMapper;
import com.example.hris.demos.web.domain.Pro;
import com.example.hris.demos.web.service.DepService;
import com.example.hris.demos.web.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProServiceImpl implements ProService {
    @Autowired
    private ProMapper proMapper;

    @Override
    public List<Pro> chPro() {
        return proMapper.selectList(null);
    }

    @Override
    public int delPro(int id) {
        return proMapper.deleteById(id);
    }

    @Override
    public int addPro(Pro pro) {
        return proMapper.insert(pro);
    }
}
