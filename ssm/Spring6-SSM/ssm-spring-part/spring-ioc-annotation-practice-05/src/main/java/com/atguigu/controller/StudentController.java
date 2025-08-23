package com.atguigu.controller;

import com.atguigu.pojo.Student;
import com.atguigu.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.lang.model.SourceVersion;
import java.util.List;

/**
 * projectName: com.atguigu.controller
 *
 * 
 * description:
 */

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void findAll() {
        List<Student> all = studentService.findAll();
        System.out.println("all = " + all);
    }
}
