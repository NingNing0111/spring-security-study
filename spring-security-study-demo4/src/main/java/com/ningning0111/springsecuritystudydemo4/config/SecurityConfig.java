package com.ningning0111.springsecuritystudydemo4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractAuthenticationFilterConfigurer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @Project: com.ningning0111.springsecuritystudydemo4.config
 * @Author: pgthinker
 * @Date: 2023/12/20 10:28
 * @Description:
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable);
        httpSecurity.authorizeHttpRequests(authorization -> {
            authorization.requestMatchers("/api/v1/home/**").hasAnyAuthority("Admin:ALL","User:ALL","Visitor:ALL")
                    .requestMatchers("/api/v1/admin/**").hasAuthority("Admin:ALL")
                    .requestMatchers("/api/v1/user/**").hasAnyAuthority("User:ALL","Admin:ALL")
                    .anyRequest()
                    .authenticated();

        });
        httpSecurity.formLogin(AbstractAuthenticationFilterConfigurer::permitAll);
        httpSecurity.logout(LogoutConfigurer::permitAll);
        return httpSecurity.build();
    }
}
