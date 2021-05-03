package com.sprboot.fast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class loginController {
    @RequestMapping("/gin")
    public String hello (){
        return "hello web";
    }
}
