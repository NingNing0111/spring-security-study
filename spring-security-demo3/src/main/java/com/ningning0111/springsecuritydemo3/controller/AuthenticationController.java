package com.ningning0111.springsecuritydemo3.controller;

import com.ningning0111.springsecuritydemo3.dto.authentication.AuthenticationRequest;
import com.ningning0111.springsecuritydemo3.dto.authentication.AuthenticationResponse;
import com.ningning0111.springsecuritydemo3.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritydemo3.controller
 * @Author: pgthinker
 * @Date: 2023/12/19 21:03
 * @Description:
 */
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ){
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }
}
