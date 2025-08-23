package com.atguigu.mapper;

import com.atguigu.pojo.User;

import java.util.List;

/**
 * projectName: com.atguigu.mapper
 *
 * 
 * description:
 */
public interface UserMapper {

    List<User> queryAll();

    int delete(int i);
}
