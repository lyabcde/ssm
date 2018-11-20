package com.yzf.service;

import com.yzf.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StudentService {

    public List<User> selectAll();

    public int save(User user);
}
