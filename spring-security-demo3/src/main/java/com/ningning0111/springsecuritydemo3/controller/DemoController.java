package com.ningning0111.springsecuritydemo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritydemo3.controller
 * @Author: pgthinker
 * @Date: 2023/12/19 21:38
 * @Description:
 */
@RestController
@RequestMapping("/api/v1/resource")
public class DemoController {
    @GetMapping("/demo")
    public String demo(){
        return "Hello Spring Security";
    }
}
