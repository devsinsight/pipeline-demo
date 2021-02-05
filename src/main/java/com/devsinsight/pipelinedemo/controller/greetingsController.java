package com.devsinsight.pipelinedemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingsController {
    

    @GetMapping()
    public String greetings(){
        return "Hello World";
    }
}
