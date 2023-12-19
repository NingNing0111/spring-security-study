package com.ningning0111.springsecuritydemo2.service;

import com.ningning0111.springsecuritydemo2.entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Project: com.ningning0111.springsecuritydemo2.service
 * @Author: pgthinker
 * @Date: 2023/12/5 01:45
 * @Description:
 */
@Service
public class DatabaseUserDetailService implements UserDetailsService {

    private final IUserService iUserService;

    public DatabaseUserDetailService(IUserService iUserService) {
        this.iUserService = iUserService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = iUserService.queryOne(username);
        System.out.println("=======>"+user);
        if(user == null){
            throw new UsernameNotFoundException(username + " does not exist.");
        }
        return user;
    }
}
