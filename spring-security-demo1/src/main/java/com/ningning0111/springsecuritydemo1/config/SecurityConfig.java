package com.ningning0111.springsecuritydemo1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Project: com.ningning0111.springsecuritydemo1.config
 * @Author: pgthinker
 * @Date: 2023/12/4 14:20
 * @Description:
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public UserDetailsService initUsers(){
        UserDetails admin = User.withUsername("admin").password("123456").build();
        UserDetails user = User.withUsername("user").password("11111").build();
        UserDetails visitor = User.withUsername("visitor").password("333333").build();

        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
        inMemoryUserDetailsManager.createUser(admin);
        inMemoryUserDetailsManager.createUser(user);
        inMemoryUserDetailsManager.createUser(visitor);
        return inMemoryUserDetailsManager;
    }

    @Bean
    public PasswordEncoder initPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

}
