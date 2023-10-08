package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("/get-all-users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/get-user/{userId}")
    public User getUser(@PathVariable Integer userId){
        return userService.getUser(userId);
    }

    @DeleteMapping("/delete-all-users")
    public String deleteAllUsers(){
        return userService.deleteAllUsers();
    }

    @DeleteMapping("/delete-user/{userId}")
    public String deleteUser(@PathVariable Integer userId){
        return userService.deleteUser(userId);
    }

    @PostMapping("/update-name/{userId}/{name}")
    public String updateName(@PathVariable Integer userId , @PathVariable String name){
        return userService.updateName(userId , name);
    }
}
