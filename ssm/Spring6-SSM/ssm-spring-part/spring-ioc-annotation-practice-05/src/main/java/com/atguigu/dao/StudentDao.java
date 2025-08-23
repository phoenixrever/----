package com.atguigu.dao;

import com.atguigu.pojo.Student;

import java.util.List;

/**
 * projectName: com.atgguigu.dao
 *
 * 
 * description: 学员持久层访问接口
 */
public interface StudentDao {

    List<Student> queryAll();
}
