package com.ethan;

import com.ethan.entity.param.UserParam;
import com.ethan.generator.tables.pojos.User;
import com.ethan.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoJooqApplicationTests {


    @Autowired
    private UserService userService;

    @Test
    public void contextLoads() {
    }



    @Test
    public void addUser(){

//        User user = new User();
//        user.setId((long)7);
//        user.setName("下棋3");
//        user.setPhone("12345678901");
//        user.setCreateAt(LocalDateTime.now());
//        userService.insertUser(user);
        UserParam user = new UserParam();
        user.setName("下棋vvvvv");
        user.setPhone("12345678901");
        userService.storeUser(user);

    }



    @Test
    public void  query(){

        //userService.queryAll().stream().forEach(user -> System.out.println(user.toString()));
        User user = userService.getById((long)1);
        System.out.println(user.toString());
    }




}
