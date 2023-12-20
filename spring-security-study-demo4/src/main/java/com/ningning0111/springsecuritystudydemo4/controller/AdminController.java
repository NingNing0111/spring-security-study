package com.ningning0111.springsecuritystudydemo4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritystudydemo4.controller
 * @Author: pgthinker
 * @Date: 2023/12/20 10:53
 * @Description:
 */
@RestController
@RequestMapping("/api/v1/admin")
public class AdminController {
    @GetMapping("/resource")
    public String resource(){
        return "This is admin resource";
    }
    @GetMapping("/add_user")
    public String addUser(){
        return "admin add a user.";
    }
}
