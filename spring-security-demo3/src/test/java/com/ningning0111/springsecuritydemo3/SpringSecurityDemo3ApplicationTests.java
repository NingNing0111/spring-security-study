package com.ningning0111.springsecuritydemo3;

import com.ningning0111.springsecuritydemo3.entity.User;
import com.ningning0111.springsecuritydemo3.mapper.UserMapper;
import com.ningning0111.springsecuritydemo3.service.JwtService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringSecurityDemo3ApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JwtService jwtService;
    @Test
    void contextLoads() {
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }


}
