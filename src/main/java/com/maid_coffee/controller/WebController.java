package com.maid_coffee.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maid_coffee.common.Result;
import com.maid_coffee.entity.Admin;
import com.maid_coffee.service.AdminService;
import com.maid_coffee.service.UserService;

import jakarta.annotation.Resource;




@RestController
public class WebController {
    @Resource
    AdminService adminService;
    UserService userService;

    @GetMapping("/")
    public Result hello(){
        return Result.success("Springboot is Running");
    }
    
    @PostMapping("/login")
    public Result login(@RequestBody Admin admin) {
        Admin dbuser = adminService.login(admin);
        return Result.success(dbuser);
    }
    
}
