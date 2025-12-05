package com.maid_coffee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.maid_coffee.entity.User;
import com.maid_coffee.exception.CustomerException;
import com.maid_coffee.mapper.UserMapper;

import cn.hutool.core.util.StrUtil;
import jakarta.annotation.Resource;

@Service
public class UserService {
    
    @Resource
    UserMapper userMapper;

    public List<User> selectAllUsers(){
        return userMapper.selectAllUsers(null);
    }

    public PageInfo<User> selectPage(Integer pageNum, Integer pageSize, User user){
        //开启分页查询
        PageHelper.startPage(pageNum,pageSize);
        List<User> list = userMapper.selectAllUsers(user);
        return PageInfo.of(list);
    }

    public void add(User user){
        //用户名查重
        User dbUser = userMapper.selectByUsername(user.getUsername());
        if(dbUser != null){
            throw new CustomerException("用户名重复");
        }
        //默认密码
        if(StrUtil.isBlank(user.getPassword())){
            user.setPassword("u123123");
        }
        userMapper.insert(user);
    }

    public void update(User user){
        userMapper.updateByUserId(user);
    }
}
