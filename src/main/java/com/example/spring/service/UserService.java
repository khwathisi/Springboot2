package com.example.spring.service;

import org.springframework.stereotype.Repository;

@Repository("UserService")
public interface UserService {
    void addUser(String name, String surname);
    void removeUser(long id);
    void getUser(long id);
}
