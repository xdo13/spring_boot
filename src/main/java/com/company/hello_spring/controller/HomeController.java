package com.company.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/") //root에 가면 홈을 불러라
    public String home(){
        return "home";
    }
}
