package com.example.hris.demos.web.service.impl;

import com.example.hris.demos.web.dao.DepMapper;
import com.example.hris.demos.web.domain.Dep;
import com.example.hris.demos.web.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepServiceImpl implements DepService {
    @Autowired
    private DepMapper depMapper;
    @Override
    public List<Dep> chDep(){
        return depMapper.selectList(null);
    }

    @Override
    public int delDep(int id) {
        return depMapper.deleteById(id);
    }

    @Override
    public int addDep(Dep dep) {
        return depMapper.insert(dep);
    }
}
