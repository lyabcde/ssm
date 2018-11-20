package com.yzf.dao;

import com.yzf.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * UserMapper - User操作类
 */

public interface UserMapper extends Mapper<User> {

    public User getById(int id);
    public List<User> getAll();

}
