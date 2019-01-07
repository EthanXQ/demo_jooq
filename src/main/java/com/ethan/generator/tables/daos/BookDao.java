/*
 * This file is generated by jOOQ.
 */
package com.ethan.generator.tables.daos;


import com.ethan.generator.tables.Book;
import com.ethan.generator.tables.records.BookRecord;

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
public class BookDao extends DAOImpl<BookRecord, com.ethan.generator.tables.pojos.Book, Integer> {

    /**
     * Create a new BookDao without any configuration
     */
    public BookDao() {
        super(Book.BOOK, com.ethan.generator.tables.pojos.Book.class);
    }

    /**
     * Create a new BookDao with an attached configuration
     */
    @Autowired
    public BookDao(Configuration configuration) {
        super(Book.BOOK, com.ethan.generator.tables.pojos.Book.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Integer getId(com.ethan.generator.tables.pojos.Book object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Book> fetchById(Integer... values) {
        return fetch(Book.BOOK.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.ethan.generator.tables.pojos.Book fetchOneById(Integer value) {
        return fetchOne(Book.BOOK.ID, value);
    }

    /**
     * Fetch records that have <code>author_id IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Book> fetchByAuthorId(Integer... values) {
        return fetch(Book.BOOK.AUTHOR_ID, values);
    }

    /**
     * Fetch records that have <code>title IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Book> fetchByTitle(String... values) {
        return fetch(Book.BOOK.TITLE, values);
    }

    /**
     * Fetch records that have <code>published_in IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Book> fetchByPublishedIn(Integer... values) {
        return fetch(Book.BOOK.PUBLISHED_IN, values);
    }

    /**
     * Fetch records that have <code>language_id IN (values)</code>
     */
    public List<com.ethan.generator.tables.pojos.Book> fetchByLanguageId(Integer... values) {
        return fetch(Book.BOOK.LANGUAGE_ID, values);
    }
}