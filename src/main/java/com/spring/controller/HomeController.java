package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by User on 5/12/2020.
 */
@Controller
public class HomeController {

    @GetMapping({"/","/index"})
    public String goIndex(){
        return "index";
    }
}
