package com.TripGuide.controller;

import com.TripGuide.entity.Result;
import com.TripGuide.entity.ResultUtil;
import com.TripGuide.entity.User;
import com.TripGuide.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServiceImpl userService;

    @PostMapping(value = "/api/login")
    @CrossOrigin       //后端跨域
    public Result login(@RequestParam String userName, @RequestParam String password){
        String msg = userService.loginService(userName,password);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("登录成功");
        } else {
            return ResultUtil.error(msg);
        }
    }

    @RequestMapping("/register")
    public Result login(@RequestBody User user) {
        String msg = userService.registerService(user);
        if (("SUCCESS").equals(msg)) {
            return ResultUtil.success("注册成功");
        } else {
            return ResultUtil.error(msg);
        }
    }
}
