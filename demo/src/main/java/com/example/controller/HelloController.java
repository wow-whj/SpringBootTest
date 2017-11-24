package com.example.controller;

import com.example.entity.Dept;
import com.example.service.DeptService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Resource
    private DeptService deptService;

    @RequestMapping("/dept")
    public List<Dept> findAll(Dept dept) {
        return deptService.findAll(dept);
    }
}
