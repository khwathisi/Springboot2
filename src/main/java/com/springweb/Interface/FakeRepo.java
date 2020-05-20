package com.springweb.Interface;
import com.springweb.Entity.User;
import org.springframework.stereotype.Repository;
import java.util.Map;
import java.util.HashMap;
import java.util.*;

@Repository
public class FakeRepo implements FakeRepoInterface{

    private static Map<Integer, User> users;

    static{
        users = new HashMap<Integer, User>() {
            {
                put(1, new User(UUID.randomUUID(),
                        "Mphuluseni",
                        "Khwathisi"));

                put(2, new User(UUID.randomUUID(),
                        "Godfrey",
                        "Khwathisi"));

                put(3, new User(UUID.randomUUID(),
                        "Vhahangwele",
                        "Khwathisi"));
            }
        };
    }

    @Override
    public User insertUser(String name, String surname) {
        users.put(1, new User(UUID.randomUUID(), name, surname));
        System.out.println(name + " entered");
        return null;
    }

    @Override
    public User findUserById(int id) {
        String name = users.get(id).getName();
        System.out.println("hello" + name);
        return null;
    }

    @Override
    public User deleteUser(int id) {
        String name = users.get(id).getName();
        this.users.remove(id);
        System.out.println(name + " removed");
        return null;
    }

}
