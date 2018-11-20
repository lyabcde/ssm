package com.yzf.controller;

import com.yzf.common.ReturnValue;
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

    @RequestMapping(value="/b", method = RequestMethod.POST)
    @ResponseBody
    public ReturnValue b(@RequestBody User user) {
        ReturnValue value = ReturnValue.newInstance();
        studentService.save(user);
        value.put("success", true);
        return value;
    }

}
