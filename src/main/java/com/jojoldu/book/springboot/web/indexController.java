package com.jojoldu.book.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping("/")
    public String index(){
        System.out.println("asd");
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        System.out.println("asd");
        return "posts-save";
    }
}
