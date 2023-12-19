package com.ningning0111.springsecuritydemo2.config;

import com.ningning0111.springsecuritydemo2.service.DatabaseUserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @Project: com.ningning0111.springsecuritydemo2.config
 * @Author: pgthinker
 * @Date: 2023/12/5 01:04
 * @Description:
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // 基于内存进行验证

//    @Bean
//    public UserDetailsService initUsers(){
//        UserDetails admin = User.withUsername("admin").password("123456").build();
//        UserDetails user = User.withUsername("user").password("11111").build();
//        UserDetails visitor = User.withUsername("visitor").password("333333").build();
//
//        InMemoryUserDetailsManager inMemoryUserDetailsManager = new InMemoryUserDetailsManager();
//        inMemoryUserDetailsManager.createUser(admin);
//        inMemoryUserDetailsManager.createUser(user);
//        inMemoryUserDetailsManager.createUser(visitor);
//        return inMemoryUserDetailsManager;
//    }

    @Bean
    public PasswordEncoder initPasswordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    public SecurityFilterChain initFilter(HttpSecurity http) throws Exception  {

        http.authorizeHttpRequests(authorization -> authorization
                // 设置`/login_page`路径允许所有人访问
                .requestMatchers("/login_page").permitAll()
                // 其它访问路径，均需要进行认证
                .anyRequest().authenticated());

        http.formLogin(login -> login
                // 设置登录页面为：`/login_page`
                .loginPage("/login_page")
                // 设置登录接口：这里的/login是Spring Security默认提供的，使用post请求
                .loginProcessingUrl("/login")
                // 登录成功后访问的路径
                .defaultSuccessUrl("/index"));
        // 禁用CSRF保护
        http.csrf(AbstractHttpConfigurer::disable);

        return http.build();
    }
}
