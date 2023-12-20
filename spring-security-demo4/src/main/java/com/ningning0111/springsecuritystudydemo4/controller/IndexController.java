package com.ningning0111.springsecuritystudydemo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritystudydemo4.controller
 * @Author: pgthinker
 * @Date: 2023/12/20 10:52
 * @Description:
 */
@RestController
public class IndexController {
    @RequestMapping("/")
    public String index(){
        return "Hello Spring Security!";
    }
}
