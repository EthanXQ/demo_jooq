/*
 * This file is generated by jOOQ.
 */
package com.ethan.generator.tables.daos;


import com.ethan.generator.tables.Department;
import com.ethan.generator.tables.records.DepartmentRecord;

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
public class DepartmentDao extends DAOImpl<DepartmentRecord, com.ethan.generator.tables.pojos.Department, Long> {

    /**
     * Create a new DepartmentDao without any configuration
     */
    public DepartmentDao() {
        super(Department.T_DEPARTMENT, com.ethan.generator.tables.pojos.Department.class);
    }

    /**
     * Create a new DepartmentDao with an attached configuration
     */
    @Autowired
    public DepartmentDao(Configuration configuration) {
        super(Department.T_DEPARTMENT, com.ethan.generator.tables.pojos.Department.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.ethan.generator.tables.pojos.Department object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Department> fetchById(Long... values) {
        return fetch(Department.T_DEPARTMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ethan.generator.tables.pojos.Department fetchOneById(Long value) {
        return fetchOne(Department.T_DEPARTMENT.ID, value);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Department> fetchByName(String... values) {
        return fetch(Department.T_DEPARTMENT.NAME, values);
    }
}
