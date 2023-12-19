package com.ningning0111.springsecuritydemo3.repository;

import com.ningning0111.springsecuritydemo3.entity.User;

/**
 * @Project: com.ningning0111.springsecuritydemo3.repository
 * @Author: pgthinker
 * @Date: 2023/12/19 19:44
 * @Description:
 */
public interface UserRepository {
    User findByUsername(String username);

    void saveUser(User user);
}
