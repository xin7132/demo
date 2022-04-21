package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class hello {
    @RequestMapping("/xin")
    public String hello(){
// 测试
        return "hello  miss 7132";
    }
}
