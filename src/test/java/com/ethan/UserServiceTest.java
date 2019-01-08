package com.ethan;

import org.jooq.DSLContext;
import org.jooq.Query;
import org.jooq.Select;
import org.jooq.SelectConditionStep;
import org.jooq.impl.DSL;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.ethan.generator.Tables.AUTHOR;
import static com.ethan.generator.Tables.USER;
import static org.jooq.impl.DSL.param;


/**
 * @Auther: qi.xia
 * @Date: 2019/1/8 09:54
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private DSLContext create;


    @Test
    public void select() {
        Select<?> select = create.select().from(USER).where(USER.ID.eq((long) 1));
        String sql = select.getSQL();
        System.out.println(sql);
        String name = select.fetch().getValues(USER.NAME).get(0);
        System.out.println("name:"+name);
    }


    @Test
    public void selectByParam() {

        Query query  = create.select().from(USER).where(USER.NAME.eq(param("lala","李四")));
        String sql = query.getSQL();
        System.out.println(sql);



    }
}
