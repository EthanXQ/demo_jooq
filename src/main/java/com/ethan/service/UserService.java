package com.ethan.service;

import com.ethan.generator.tables.pojos.User;

import java.util.List;

/**
 * @Auther: qi.xia
 * @Date: 2018/12/2 15:36
 * @Description:
 */
public interface UserService {

    void insertUser(User user);


    List<User> queryAll();


    String getJosn();
}
