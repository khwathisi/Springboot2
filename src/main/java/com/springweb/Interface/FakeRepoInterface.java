package com.springweb.Interface;
import com.springweb.Entity.User;
import java.util.Collection;

public interface FakeRepoInterface {
    User insertUser(String name, String surname);
    User findUserById(int id);
    User deleteUser(int id);
}
