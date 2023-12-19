package com.ningning0111.springsecuritydemo3.controller;

import com.ningning0111.springsecuritydemo3.dto.register.RegisterRequest;
import com.ningning0111.springsecuritydemo3.dto.register.RegisterResponse;
import com.ningning0111.springsecuritydemo3.service.RegisterService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritydemo3.controller
 * @Author: pgthinker
 * @Date: 2023/12/19 21:22
 * @Description:
 */
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class RegisterController {
    private final RegisterService registerService;
    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(
            @RequestBody RegisterRequest request
    ){
        return ResponseEntity.ok(registerService.register(request));
    }
}
