package com.etoak.service;

import com.etoak.bean.User;

/**
 * Created by 18474 on 2020/4/25.
 */
public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    int addUser(User user);
}
