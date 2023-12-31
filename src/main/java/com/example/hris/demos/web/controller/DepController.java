package com.example.hris.demos.web.controller;

import com.example.hris.demos.web.domain.Dep;
import com.example.hris.demos.web.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class DepController {
    @Autowired
    private DepService depService;
    @GetMapping("/chdep")
    public List<Dep> chDep(){
        return depService.chDep();
    }
    @PostMapping("/adddep")
    public int adddep(@ModelAttribute Dep dep){
        return depService.addDep(dep);
    }
    @GetMapping("/deldep")
    public int delDep(int id){
        return depService.delDep(id);
    }
}
