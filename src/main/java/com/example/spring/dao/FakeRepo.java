package com.example.spring.dao;

import com.example.spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("FakeRepoInterface")
public class FakeRepo implements FakeRepoInterface {
    private static List<User> User = new ArrayList<>();

    @Override
    public String insertUser(Long id, User user) {
        User.add(new User(id, user.getName(), user.getSurname()));
        return user.getName();
    }

    @Override
    public String findUserById(Long id) {
        String name = User.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst().toString();
        return name;
    }

    @Override
    public String deleteUser(Long id) {
        String name = User.get(id.intValue()).toString();
        Optional<User> userAvailable = User.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
        if(userAvailable.isEmpty())
        {
            return "";
        }else{
            User.remove(userAvailable);
            return name;
        }

    }
}
