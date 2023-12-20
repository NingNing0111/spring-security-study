package com.ningning0111.springsecuritystudydemo4.repository;

import com.ningning0111.springsecuritystudydemo4.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Project: com.ningning0111.springsecuritystudydemo4.repository
 * @Author: pgthinker
 * @Date: 2023/12/20 10:32
 * @Description:
 */
@Repository
@RequiredArgsConstructor
public class UserRepository {
    public User queryByUsername(String username){
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        List<User> users = new ArrayList<>();
        User admin = User.builder()
                .username("admin")
                .password(passwordEncoder.encode("123456"))
                .authorities(Arrays.asList("Admin:ALL", "User:ALL","Visitor:ALL"))
                .build();
        User user = User.builder()
                .username("user")
                .password(passwordEncoder.encode("223344"))
                .authorities(Arrays.asList("User:ALL", "Visitor:ALL"))
                .build();
        User visitor = User.builder()
                .username("visitor")
                .password(passwordEncoder.encode("224433"))
                .authorities(List.of("Visitor:ALL"))
                .build();
        users.add(admin);
        users.add(user);
        users.add(visitor);

        for (User item: users){
            if (item.getUsername().equals(username)){
                return item;
            }
        }
        throw new UsernameNotFoundException(username + " does not exist.");
    }
}
