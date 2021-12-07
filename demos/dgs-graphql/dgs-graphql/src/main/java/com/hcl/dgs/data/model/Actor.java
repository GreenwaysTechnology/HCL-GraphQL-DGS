package com.hcl.dgs.data.model;

public class Actor {
    private String id;
    private String name;
    private Integer age;
    private Address address;

    public Actor(String id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Actor(String id, String name, Integer age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
