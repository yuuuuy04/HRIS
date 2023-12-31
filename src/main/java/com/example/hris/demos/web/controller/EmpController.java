package com.example.hris.demos.web.controller;

import com.example.hris.demos.web.domain.Dep;
import com.example.hris.demos.web.domain.Emp;
import com.example.hris.demos.web.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class EmpController {
    @Autowired
    private EmpService empService;
    @GetMapping("/chemp")
    public List<Emp> chemp(){
        return empService.chEmp();
    }
    @PostMapping("/addemp")
    public int addemp(@ModelAttribute Emp emp){
        return empService.addEmp(emp);
    }
    @GetMapping("/delemp")
    public int delemp(int id){
        return empService.delEmp(id);
    }
}
