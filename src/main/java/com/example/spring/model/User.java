package com.example.spring.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private final Long id;
    private final String name;
    private final String surname;

    public User(Long id, @JsonProperty("name") String name, @JsonProperty("surname") String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }



}
