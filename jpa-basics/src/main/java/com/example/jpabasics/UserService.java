package com.example.jpabasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepo;

    public String addUser(User user){
        userRepo.save(user); //This single save() method basically does the entire work of inserting into SQL db
        return "USER ADDED";
    }

    public List<User> getAllUsers() {
        return userRepo.findAll();
    }

    public User getUser(Integer userId) {
        return userRepo.findById(userId).get(); //If ID didn't exist in db, findById would throw exception, .get() is used to get that
    }

    public String deleteAllUsers() {
        userRepo.deleteAll();
        return "All users deleted";
    }

    public String deleteUser(Integer userId) {
        userRepo.deleteById(userId);
        return "User deleted";
    }

    public String updateName(Integer userId , String name) {
        User currUser = userRepo.findById(userId).get();
        currUser.setName(name);
        userRepo.save(currUser);
        return "Name changed";
    }
}
