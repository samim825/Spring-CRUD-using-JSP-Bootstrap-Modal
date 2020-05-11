package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by User on 5/12/2020.
 */
@Controller
public class HomeController {

    @GetMapping({"/","/index"})
    public String goIndex(){
        System.out.println("goIndex method visited");
        return "home";
    }
}
