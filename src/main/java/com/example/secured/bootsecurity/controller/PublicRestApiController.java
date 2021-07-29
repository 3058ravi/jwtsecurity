package com.example.secured.bootsecurity.controller;

import com.example.secured.bootsecurity.db.UserRepository;
import com.example.secured.bootsecurity.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/public")
public class PublicRestApiController {
    @Autowired
    private UserRepository userRepository;

    public PublicRestApiController() {
    }

    @GetMapping("test")
    public String test1() {
        return "API Test 1";
    }


    @GetMapping("admin/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @GetMapping("management/reports")
    public String management() {
        return "some reports content";
    }




}
