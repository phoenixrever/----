package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * projectName: com.atguigu.controller
 *
 * 
 * description:
 */

@Controller
@ResponseBody
public class HelloController {

    @GetMapping("hello")
    public String ret() {
        return "hello";
    }
}
