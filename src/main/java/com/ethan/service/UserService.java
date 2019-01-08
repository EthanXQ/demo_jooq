package com.ethan.service;

import com.ethan.entity.param.UserParam;
import com.ethan.generator.tables.pojos.User;

import java.util.List;

/**
 * @Auther: qi.xia
 * @Date: 2018/12/2 15:36
 * @Description:
 */
public interface UserService {

    Long insertUser(User user);

    void storeUser(UserParam user);

    void deleteById(Long userId);


    List<User> queryAll();

    List<User> queryByParam(UserParam param);


    String getJosn();

    User getById(Long id);
}
