package com.jwt.security.service;

import com.jwt.security.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Deepak Mishra", "deepak@email.com"));
    }

    public List<User> getUser(){
        return this.store;
    }

}
