package com.lyy.shiro.service;

import com.github.pagehelper.Page;
import com.lyy.shiro.entity.User;
import com.lyy.shiro.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: ly
 * @Date: 2018/11/29 14:09
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;
    public Page<User> getUsers(){
        return userMapper.getUsers();
    }

    public User selectById(long id){
       return userMapper.selectByPrimaryKey(id);

    }
}
