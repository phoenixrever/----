package com.atguigu.service;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * projectName: com.atguigu.service
 *
 * 
 * description: 学员的业务接口
 */
public interface StudentService {

    List<Student> findAll();
}
