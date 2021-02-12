package com.project.webstore.controllers;

import com.project.webstore.entities.User;
import com.project.webstore.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@Controller
public class GreetingController {
    @Autowired
    private UserRepo userRepo;
    @GetMapping("/get-users")
    public String getAllUsers(Map<String,Object> pattern) {
        List<User> userList = userRepo.findAll();
        pattern.put("users",userList);
        return "getAllUsers";
    }
}
