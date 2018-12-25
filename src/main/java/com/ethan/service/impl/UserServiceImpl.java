package com.ethan.service.impl;

import com.ethan.generator.tables.pojos.User;
import com.ethan.service.UserService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import static com.ethan.generator.Tables.USER;

/**
 * @Auther: qi.xia
 * @Date: 2018/12/2 15:36
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DSLContext create;


    //取别名
    com.ethan.generator.tables.User u = USER;

    @Override
    public void insertUser(User user) {

        create.insertInto(u).columns(u.NAME, u.PHONE, u.CREATE_AT).
                values(user.getName(), user.getPhone(), user.getCreateAt()).execute();

    }

    @Override
    public List<User> queryAll() {

        List<User> list = create.select().from(u).orderBy(u.CREATE_AT.desc()).fetchInto(User.class);
        return list;
    }


    @Override
    public String getJosn() {
        return create.select().from(u).fetch().formatJSON();
    }
}
