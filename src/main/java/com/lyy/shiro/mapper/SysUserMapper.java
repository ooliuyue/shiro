package com.lyy.shiro.mapper;

import com.lyy.shiro.entity.SysUser;

public interface SysUserMapper {
    SysUser findByUserName(String userName);
}
