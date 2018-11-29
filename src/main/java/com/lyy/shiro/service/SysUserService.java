package com.lyy.shiro.service;

import com.lyy.shiro.entity.SysUser;
import com.lyy.shiro.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: ly
 * @Date: 2018/11/29 14:06
 */
@Service
public class SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;
    public SysUser findByUserName(String userName){
        return sysUserMapper.findByUserName(userName);
    }
}
