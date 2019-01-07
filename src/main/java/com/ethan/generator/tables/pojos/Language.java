/*
 * This file is generated by jOOQ.
 */
package com.ethan.generator.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class Language implements Serializable {

    private static final long serialVersionUID = -589664311;

    private Integer id;
    private String  cd;
    private String  description;

    public Language() {}

    public Language(Language value) {
        this.id = value.id;
        this.cd = value.cd;
        this.description = value.description;
    }

    public Language(
        Integer id,
        String  cd,
        String  description
    ) {
        this.id = id;
        this.cd = cd;
        this.description = description;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCd() {
        return this.cd;
    }

    public void setCd(String cd) {
        this.cd = cd;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Language (");

        sb.append(id);
        sb.append(", ").append(cd);
        sb.append(", ").append(description);

        sb.append(")");
        return sb.toString();
    }
}