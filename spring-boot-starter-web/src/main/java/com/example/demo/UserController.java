package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:5173") // Allows Vite/React frontend to connect
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @getMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @postMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
