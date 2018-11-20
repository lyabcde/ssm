package com.yzf.service.impl;

import com.yzf.dao.UserMapper;
import com.yzf.entity.User;
import com.yzf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> selectAll() {
        return userMapper.getAll();
    }

    @Override
    public int save(User user) {
        userMapper.insertSelective(user);
        return 0;
    }
}
