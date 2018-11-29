package com.lyy.shiro.controller;

import com.lyy.shiro.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: ly
 * @Date: 2018/11/29 15:14
 */
@Controller
public class IndexController {

    @RequestMapping(value = {"/","/index"})
    public String index(Model model){
        SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("userName",sysUser.getFullName());
        return "/index";
    }
}
