package com.ethan.service.impl;

import com.ethan.entity.param.UserParam;
import com.ethan.generator.tables.daos.UserDao;
import com.ethan.generator.tables.pojos.Department;
import com.ethan.generator.tables.pojos.User;
import com.ethan.generator.tables.records.UserRecord;
import com.ethan.service.UserService;
import org.jooq.DSLContext;
import org.jooq.SelectQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Autowired
    private UserDao userDao;


    /**
     * 取别名
     */
    com.ethan.generator.tables.User u = USER;

    @Override
    public Long insertUser(User user) {

        UserRecord record = create.insertInto(u).columns(u.NAME, u.PHONE, u.CREATE_AT).
                values(user.getName(), user.getPhone(), user.getCreateAt()).returning(u.ID).fetchOne();
        return record.getId();
    }

    @Override
    public void storeUser(UserParam param) {
        UserRecord record = create.newRecord(USER, param);
        record.insert();
    }

    @Override
    public void deleteById(Long userId) {
        userDao.deleteById(userId);
    }

    @Override
    public List<User> queryAll() {
        List<User> list = create.select().from(u).orderBy(u.CREATE_AT.desc()).fetchInto(User.class);
        return list;
    }

    @Override
    public List<User> queryByParam(UserParam param) {
        SelectQuery<UserRecord> query = create.selectQuery(USER);
        query.addConditions();
        return null;
    }

    @Override
    public User getById(Long id) {
        return userDao.findById(id);
    }

    @Override
    public String getJosn() {
        return create.select().from(u).fetch().formatJSON();
    }
}
