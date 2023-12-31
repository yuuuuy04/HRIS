package com.example.hris.demos.web.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Controller
@CrossOrigin
public class PageController {
    @GetMapping("/welcomepage")
    @ResponseBody
    public String welcomepage() throws IOException {
        Resource resource = new ClassPathResource("static/welcomepage.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/chdeppage")
    @ResponseBody
    public String chdeppage() throws IOException {
        Resource resource = new ClassPathResource("static/chdep.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/chemppage")
    @ResponseBody
    public String chemppage() throws IOException {
        Resource resource = new ClassPathResource("static/chemp.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/chpropage")
    @ResponseBody
    public String chpropage() throws IOException {
        Resource resource = new ClassPathResource("static/chpro.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/adddeppage")
    @ResponseBody
    public String adddeppage() throws IOException {
        Resource resource = new ClassPathResource("static/adddep.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/addemppage")
    @ResponseBody
    public String addemppage() throws IOException {
        Resource resource = new ClassPathResource("static/addemp.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/addpropage")
    @ResponseBody
    public String addpropage() throws IOException {
        Resource resource = new ClassPathResource("static/addpro.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/deldeppage")
    @ResponseBody
    public String deldeppage() throws IOException {
        Resource resource = new ClassPathResource("static/deldep.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/delemppage")
    @ResponseBody
    public String delemppage() throws IOException {
        Resource resource = new ClassPathResource("static/delemp.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
    @GetMapping("/delpropage")
    @ResponseBody
    public String delpropage() throws IOException {
        Resource resource = new ClassPathResource("static/delpro.html");
        Path path = resource.getFile().toPath();
        String content = new String(Files.readAllBytes(path));
        return content;
    }
}
