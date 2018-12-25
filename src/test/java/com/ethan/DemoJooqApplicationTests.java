package com.ethan;

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

        User user = new User();
        user.setName("张三2");
        user.setPhone("12345678901");
        user.setCreateAt(LocalDateTime.now());
        userService.insertUser(user);


    }



    @Test
    public void  query(){

        userService.queryAll().stream().forEach(user -> System.out.println(user.toString()));

    }




}
