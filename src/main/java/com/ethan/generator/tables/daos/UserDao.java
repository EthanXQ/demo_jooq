/*
 * This file is generated by jOOQ.
 */
package com.ethan.generator.tables.daos;


import com.ethan.generator.tables.User;
import com.ethan.generator.tables.records.UserRecord;

import java.time.LocalDateTime;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class UserDao extends DAOImpl<UserRecord, com.ethan.generator.tables.pojos.User, Long> {

    /**
     * Create a new UserDao without any configuration
     */
    public UserDao() {
        super(User.USER, com.ethan.generator.tables.pojos.User.class);
    }

    /**
     * Create a new UserDao with an attached configuration
     */
    @Autowired
    public UserDao(Configuration configuration) {
        super(User.USER, com.ethan.generator.tables.pojos.User.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.ethan.generator.tables.pojos.User object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.User> fetchById(Long... values) {
        return fetch(User.USER.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ethan.generator.tables.pojos.User fetchOneById(Long value) {
        return fetchOne(User.USER.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.User> fetchByName(String... values) {
        return fetch(User.USER.NAME, values);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.User> fetchByPhone(String... values) {
        return fetch(User.USER.PHONE, values);
    }

    /**
     * Fetch records that have <code>create_at IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.User> fetchByCreateAt(LocalDateTime... values) {
        return fetch(User.USER.CREATE_AT, values);
    }
}
