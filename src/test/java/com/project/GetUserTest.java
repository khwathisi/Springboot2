package com.project;

import com.springweb.Entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GetUserTest {
    @Test
    @Autowired
    void contextLoads() throws InterruptedException {
        String testString = User.getUser() + "\n" +
                User.getUser() + "\n" +
                User.getUser() + "\n" +
                User.getUser();
        Assert.assertEquals(testString, User.getUser());
    }

}