package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping ("/home")
    public String home() {   //name can be different
        return "home.html";
    }

    @RequestMapping ("/abc")
    public String welcome() {   //name can be different
        return "abc.html";
    }
}
