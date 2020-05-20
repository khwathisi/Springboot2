package com.springweb;
import com.springweb.Interface.FakeRepo;
import com.springweb.Interface.UserServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import java.util.UUID;

@SpringBootApplication
public class Main {
    public static void main(String args[])
    {
        UserServiceImpl userService = new UserServiceImpl();
        FakeRepo fakeRepo = new FakeRepo();

        String name = "John";
        String surname = "Smith";
        int id = 1;

        fakeRepo.insertUser(name, surname);
        //fakeRepo.findUserById(id);
        //fakeRepo.deleteUser(id);
        //fakeRepo.findUserById(id);
        //userService.insertUser(name, surname);
    }
}
