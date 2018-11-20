package com.yzf.controller;

import com.yzf.entity.User;
import com.yzf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value="/a",method = RequestMethod.GET)
    @ResponseBody
    public List<User> a() {
        List<User> list = studentService.selectAll();
        return list;
    }
}
