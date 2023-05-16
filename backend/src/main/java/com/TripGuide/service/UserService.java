package com.TripGuide.service;

import com.TripGuide.entity.User;


public interface UserService{

    public String loginService(String userName, String password);

    public String registerService(User user);
}
