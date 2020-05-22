package com.example.spring.dao;

import com.example.spring.model.User;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public interface FakeRepoInterface {

    String insertUser(Long id, User user);

    default String insertUser(User user){
        Long id = ThreadLocalRandom.current().nextLong(10,100);
        return insertUser(id,user);
    }

    String findUserById(Long id);

    String deleteUser(Long id);

}
