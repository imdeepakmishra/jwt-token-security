package com.jwt.security.controller;

import com.jwt.security.model.User;
import com.jwt.security.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    UserService userService;

    @GetMapping("/test")
    public String test() {
        return "Spring boot is working";
    }

    @RequestMapping("/user")
    public List<User> getUser() {
        return this.userService.getUser();
    }


}
