package com.example.dao;

import com.example.entity.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DeptDao {
    List<Dept> findAll(Dept dept);
}
