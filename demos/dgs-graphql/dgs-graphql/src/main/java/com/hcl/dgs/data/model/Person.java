package com.hcl.dgs.data.model;

import java.time.OffsetDateTime;

public class Person implements SearchResult {
    private String name;

    private Integer age;
    private OffsetDateTime dob;

    public Person() {
    }

    public Person(String name, Integer age, OffsetDateTime dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }

    public OffsetDateTime getDob() {
        return dob;
    }

    public void setDob(OffsetDateTime dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}
