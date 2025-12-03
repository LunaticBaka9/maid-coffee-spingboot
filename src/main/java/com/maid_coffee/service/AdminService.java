package com.maid_coffee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.maid_coffee.entity.Admin;
import com.maid_coffee.exception.CustomerException;
import com.maid_coffee.mapper.AdminMapper;

import jakarta.annotation.Resource;


@Service
public class AdminService {
    
    @Resource
    AdminMapper adminMapper;

    public String admin(String name){
        if("admin".equals(name)){
            return "admin";
        } else{
            throw new CustomerException("账号错误");
        }
    }

    public List<Admin> selectAll(){
        return adminMapper.selectAll();
    }
}
