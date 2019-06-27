package com.egsw.sandbx.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserDAOService service;

    @GetMapping(path = "/users")
    public List<User> retrieveAllUsers(){
        return service.findAll();
    }

//    @PostMapping(path = "/users")
//    public List<User> retrieveAllUsers(){
//        return service.findAll();
//    }

    @GetMapping(path = "/users/{id}")
    public User retrieveAllUsers(@PathVariable int id){
        return service.findOne(id);
    }
}
