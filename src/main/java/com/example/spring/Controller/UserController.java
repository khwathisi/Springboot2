package com.example.spring.Controller;
import com.example.spring.model.User;
import com.example.spring.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Controller/UserController")
public class UserController {
    private UserServiceImpl userService;

    @Autowired
    public void UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping(path = "{id}")
    public String getUser(@PathVariable("id") Long id){
        return userService.getUser(id);
    }

    @DeleteMapping(path = "{id}")
    public String removeUser(@PathVariable("id") Long id){
        return userService.removeUser(id);
    }
}
