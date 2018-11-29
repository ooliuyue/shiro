package com.lyy.shiro.service;

import com.lyy.shiro.mapper.SysPermissionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Auther: ly
 * @Date: 2018/11/29 14:01
 */
@Service
public class SysPermissionService {
    @Resource
    private SysPermissionMapper sysPermissionMapper;

    public List<String> selectPermissionByUserId(long userId) {
        return sysPermissionMapper.selectPermissionByUserId(userId);
    }
}
