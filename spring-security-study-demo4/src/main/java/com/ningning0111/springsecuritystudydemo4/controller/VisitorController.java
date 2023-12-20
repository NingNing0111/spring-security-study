package com.ningning0111.springsecuritystudydemo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritystudydemo4.controller
 * @Author: pgthinker
 * @Date: 2023/12/20 10:57
 * @Description:
 */
@RequestMapping("/api/v1/home")
@RestController
public class VisitorController {
    @RequestMapping("/images")
    public String images(){
        return "load images";
    }
}
