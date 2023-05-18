package com.TripGuide.service.serviceImpl;

import com.TripGuide.entity.Result;
import com.TripGuide.entity.User;
import com.TripGuide.mapper.UserMapper;
import com.TripGuide.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class UserServiceImpl implements UserService  {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String loginService(String userName, String password) {
        User user = userMapper.searchByUserName(userName);
        if (user != null) {
            if (password.equals(user.getPassword())) {
                return "SUCCESS";
            } else {
                return "密码错误";
            }
        }
        return "此用户不存在";
    }

    @Override
    public String registerService(User user) {
        User userE = userMapper.searchByUserName(user.getUserName());
        if (userE == null) {
            if ("".equals(user.getPassword())) {
                return "请输入密码";
            } else if ("".equals(user.getUserName())) {
                return "请输入用户昵称";
            } else {
                userMapper.insert(user);
                return "SUCCESS";
            }
        }
        return "用户已存在";
    }
}
