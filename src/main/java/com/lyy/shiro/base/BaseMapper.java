package com.lyy.shiro.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Auther: ly
 * @Date: 2018/11/29 11:38
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

