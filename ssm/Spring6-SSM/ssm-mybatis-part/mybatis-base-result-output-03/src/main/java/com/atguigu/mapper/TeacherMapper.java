package com.atguigu.mapper;

import com.atguigu.pojo.Teacher;

/**
 * projectName: com.atguigu.mapper
 *
 * 
 * description:
 */
public interface TeacherMapper {

    int insertTeacher(Teacher teacher);

    Teacher queryById(String tId);
}
