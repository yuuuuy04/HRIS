package com.example.hris.demos.web.controller;

import com.example.hris.demos.web.domain.Emp;
import com.example.hris.demos.web.domain.Pro;
import com.example.hris.demos.web.service.ProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class ProController {
    @Autowired
    private ProService proService;
    @GetMapping("/chpro")
    public List<Pro> chpro(){
        return proService.chPro();
    }
    @PostMapping("/addpro")
    public int addpro(@ModelAttribute Pro pro){
        return proService.addPro(pro);
    }
    @GetMapping("/delpro")
    public int delpro(int id){
        return proService.delPro(id);
    }
}
