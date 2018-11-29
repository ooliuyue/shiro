package com.lyy.shiro.mapper;

import com.github.pagehelper.Page;
import com.lyy.shiro.base.BaseMapper;
import com.lyy.shiro.entity.User;

public interface UserMapper extends BaseMapper<User> {
    Page<User> getUsers();
}
