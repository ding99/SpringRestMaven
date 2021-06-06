package com.example.demo.controllers;

import com.example.demo.models.User;
import com.example.demo.repo.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by ding_ on 6/6/2021
 */
@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> findAllUsers(){
        List<User> users = (List<User>) userRepository.findAll();
        System.out.println("count: " + users.stream().count());
        return users;
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findUserById(@PathVariable(value = "id") int id){
        Optional<User> user = userRepository.findById(id);
        System.out.println("name: " + user);

        if(user.isPresent()){
            return ResponseEntity.ok().body(user.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public User saveUser(@Validated @RequestBody User user){
        return userRepository.save(user);
    }
}
