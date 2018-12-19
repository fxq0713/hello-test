package com.chq.demo.hellotest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试
 *
 * @author CHQ
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    @RequestMapping("/")
    public String index() {
        return "这是个测试项目";
    }

}
