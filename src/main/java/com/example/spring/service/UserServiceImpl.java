package com.example.spring.service;

import com.example.spring.dao.FakeRepoInterface;
import com.example.spring.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private FakeRepoInterface fakeRepoInterface;
    private UserService userService;

    public UserServiceImpl(FakeRepoInterface fakeRepoInterface, UserService userServiceI) {
    }

    @Autowired
    public void UserServiceImpl(@Qualifier("FakeRepoInterface") FakeRepoInterface fakeRepoInterface,/*@Qualifier("UserService")*/ UserService userService) {
        this.fakeRepoInterface = fakeRepoInterface;
        this.userService = userService;
    }

    public void addUser (String name, String surname){
        userService.addUser(name,surname);
    }

    public void removeUser (long id){
        userService.removeUser(id);
    }

    public void getUser (long id){
        userService.getUser(id);
    }

    public String addUser (User user){
        return fakeRepoInterface.insertUser(user)+" entered";
    }

    public String removeUser (Long id){
        return fakeRepoInterface.deleteUser(id)+" removed";
    }

    @Cacheable(value = "getUserCache")
    public String getUser (Long id){
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        return "hello "+fakeRepoInterface.findUserById(id);
    }
}
