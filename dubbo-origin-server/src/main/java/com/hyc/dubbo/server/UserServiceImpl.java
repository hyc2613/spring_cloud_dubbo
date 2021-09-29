package com.hyc.dubbo.server;

import com.hyc.dubbo.client.User;
import com.hyc.dubbo.client.UserService;

public class UserServiceImpl implements UserService {
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setName("hyc");
        user.setSex("M");
        return user;
    }
}
