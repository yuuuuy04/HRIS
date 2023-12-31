package com.example.hris;

import com.example.hris.demos.web.dao.EmpMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HrisApplicationTests {
    @Autowired
    private EmpMapper empMapper;
    @Test
    void contextLoads() {
        empMapper.deleteById(9);
    }

}
