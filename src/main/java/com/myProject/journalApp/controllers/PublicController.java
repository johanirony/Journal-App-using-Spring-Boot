package com.myProject.journalApp.controllers;

import com.myProject.journalApp.entity.Users;
import com.myProject.journalApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PublicController {
    @Autowired
    private UserService userService;


    @PostMapping("/create-user")
    public boolean createUsers(@RequestBody Users user){
        userService.saveEntry(user);
        return true;
    }
}
