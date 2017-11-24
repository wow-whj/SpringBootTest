package com.example.service;

import com.example.dao.DeptDao;
import com.example.entity.Dept;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class DeptService {

    @Resource
    private DeptDao dao;

    public List<Dept> findAll(Dept dept) {
        return dao.findAll(dept);
    }
}
