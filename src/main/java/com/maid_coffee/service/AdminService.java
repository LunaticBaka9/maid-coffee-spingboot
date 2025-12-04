package com.maid_coffee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public List<Admin> selectAllAdmins(){
        return adminMapper.selectAllAdmins();
    }

    public PageInfo<Admin> selectPage(Integer pageNum, Integer pageSize){
        //开启分页查询
        PageHelper.startPage(pageNum,pageSize);
        List<Admin> list = adminMapper.selectAllAdmins();
        return PageInfo.of(list);
    }
}
