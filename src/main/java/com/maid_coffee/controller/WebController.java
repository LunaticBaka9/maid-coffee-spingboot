package com.maid_coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid_coffee.common.Result;



@RestController
public class WebController {

    @GetMapping("/")
    public Result hello(){
        return Result.success("Springboot is Running");
    }
    
}
