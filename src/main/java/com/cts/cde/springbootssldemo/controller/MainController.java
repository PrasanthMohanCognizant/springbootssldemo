package com.cts.cde.springbootssldemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("name", "testCandidate");
        return "hello";
    }
}
