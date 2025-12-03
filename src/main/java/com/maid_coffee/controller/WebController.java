package com.maid_coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid_coffee.common.Result;
import com.maid_coffee.service.AdminService;

import jakarta.annotation.Resource;



@RestController
public class WebController {

    @Resource
    AdminService adminService;

    @GetMapping("/hello")
    public Result hello(){
        return Result.success("Just for Fucking Test");
    }

    @GetMapping("/admin")
    public Result admin(String name) {
        adminService.admin(name);
        return Result.success("123123");
    }
    
}
