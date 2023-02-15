package com.java3y.austin.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/test")
    private String test(){
        return "请给我三连好吗?";
    }
}
