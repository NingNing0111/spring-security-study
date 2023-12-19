package com.ningning0111.springsecuritydemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Project: com.ningning0111.springsecuritydemo2.controller
 * @Author: pgthinker
 * @Date: 2023/12/5 01:09
 * @Description:
 */
@Controller
public class LoginController {
    @GetMapping("/login_page")
    public String loginPage(){
        return "login";
    }
}
