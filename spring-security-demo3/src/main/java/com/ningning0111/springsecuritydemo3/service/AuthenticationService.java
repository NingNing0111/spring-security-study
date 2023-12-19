package com.ningning0111.springsecuritydemo3.service;

import com.ningning0111.springsecuritydemo3.dto.authentication.AuthenticationRequest;
import com.ningning0111.springsecuritydemo3.dto.authentication.AuthenticationResponse;
import com.ningning0111.springsecuritydemo3.entity.User;
import com.ningning0111.springsecuritydemo3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

/**
 * @Project: com.ningning0111.springsecuritydemo3.service
 * @Author: pgthinker
 * @Date: 2023/12/19 21:07
 * @Description:
 */
@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final AuthenticationManager authenticationManager;
    private final UserRepository userRepository;
    private final JwtService jwtService;
    public AuthenticationResponse authenticate(AuthenticationRequest authenticationRequest){
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        authenticationRequest.getUsername(),
                        authenticationRequest.getPassword())
        );
        User user = userRepository.findByUsername(authenticationRequest.getUsername());
        String jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .build();
    }
}
