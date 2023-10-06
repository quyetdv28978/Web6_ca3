package com.example.quanlycongviec_web6.controller.web;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class login {

    @GetMapping("test")
    public String test() {
        return "quyet";
    }
}
