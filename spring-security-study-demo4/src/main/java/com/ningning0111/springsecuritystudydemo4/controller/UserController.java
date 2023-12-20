package com.ningning0111.springsecuritystudydemo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritystudydemo4.controller
 * @Author: pgthinker
 * @Date: 2023/12/20 10:55
 * @Description:
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    @RequestMapping("/comment")
    public String comment(){
        return "user comment a statement.";
    }
    @RequestMapping("/my_home")
    public String myHome(){
        return "user's home";
    }
}
