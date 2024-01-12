package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Component
@ResponseBody

public class SecuredController {

    @GetMapping("/home")
    public String securedHome() {
       
        return "secured-home";
    }
}
