package com.example.hris.demos.web.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.hris.demos.web.domain.Emp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmpMapper extends BaseMapper<Emp> {
}
