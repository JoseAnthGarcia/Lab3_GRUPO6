package com.example.desarrollo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/lab8")
public class Lab8Controller {

    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }
}
