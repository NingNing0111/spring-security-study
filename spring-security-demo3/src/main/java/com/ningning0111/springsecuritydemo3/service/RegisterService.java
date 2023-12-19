package com.ningning0111.springsecuritydemo3.service;

import com.ningning0111.springsecuritydemo3.dto.register.RegisterRequest;
import com.ningning0111.springsecuritydemo3.dto.register.RegisterResponse;
import com.ningning0111.springsecuritydemo3.entity.User;
import com.ningning0111.springsecuritydemo3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * @Project: com.ningning0111.springsecuritydemo3.service
 * @Author: pgthinker
 * @Date: 2023/12/19 21:26
 * @Description:
 */
@Service
@RequiredArgsConstructor
public class RegisterService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public RegisterResponse register(RegisterRequest request){
        String username = request.getUsername();
        String password = request.getPassword();
        User user = userRepository.findByUsername(username);
        if (user != null){
            return RegisterResponse.builder()
                    .message(username + " already exists")
                    .build();
        }
        User saveUser = User.builder()
                .username(username)
                .password(passwordEncoder.encode(password))
                .build();
        System.out.println(saveUser);
        userRepository.saveUser(saveUser);
        return RegisterResponse.builder()
                .message("registration success.")
                .build();
    }
}
