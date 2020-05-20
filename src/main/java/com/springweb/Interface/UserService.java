package com.springweb.Interface;
import com.springweb.Entity.User;
import java.util.Map;

public interface UserService {
    void addUser(String name, String surname);
    void removeUser(long id);
    void getUser(long id);
}
