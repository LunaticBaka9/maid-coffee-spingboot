package com.maid_coffee.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maid_coffee.common.Result;
import com.maid_coffee.entity.Admin;
import com.maid_coffee.service.AdminService;

import jakarta.annotation.Resource;


@RestController
@RequestMapping("/admin")
public class AdminController {
    
    @Resource
    AdminService adminService;

    @GetMapping("/selectAll")  //完整的请求路径 /admin/selectAll
    public Result selectAll() {
        List<Admin> adminList = adminService.selectAll();
        return Result.success(adminList);
    }
    
}
