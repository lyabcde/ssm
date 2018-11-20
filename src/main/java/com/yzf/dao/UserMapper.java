package com.yzf.dao;

import com.yzf.entity.User;

import java.util.List;

/**
 * UserMapper - User操作类
 */

public interface UserMapper {

    public User getById(int id);
    public List<User> getAll();

}
