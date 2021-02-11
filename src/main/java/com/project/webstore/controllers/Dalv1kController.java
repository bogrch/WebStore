package com.project.webstore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dalv1kController {

    @RequestMapping("/hello")
    public String dalv1k(){
        return "pizdec1";
    }
}
