/*
 * This file is generated by jOOQ.
 */
package com.ethan.generator.tables.daos;


import com.ethan.generator.tables.Language;
import com.ethan.generator.tables.records.LanguageRecord;

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
public class LanguageDao extends DAOImpl<LanguageRecord, com.ethan.generator.tables.pojos.Language, Integer> {

    /**
     * Create a new LanguageDao without any configuration
     */
    public LanguageDao() {
        super(Language.LANGUAGE, com.ethan.generator.tables.pojos.Language.class);
    }

    /**
     * Create a new LanguageDao with an attached configuration
     */
    @Autowired
    public LanguageDao(Configuration configuration) {
        super(Language.LANGUAGE, com.ethan.generator.tables.pojos.Language.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.ethan.generator.tables.pojos.Language object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Language> fetchById(Integer... values) {
        return fetch(Language.LANGUAGE.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ethan.generator.tables.pojos.Language fetchOneById(Integer value) {
        return fetchOne(Language.LANGUAGE.ID, value);
    }

    /**
     * Fetch records that have <code>cd IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Language> fetchByCd(String... values) {
        return fetch(Language.LANGUAGE.CD, values);
    }

    /**
     * Fetch records that have <code>description IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Language> fetchByDescription(String... values) {
        return fetch(Language.LANGUAGE.DESCRIPTION, values);
    }
}