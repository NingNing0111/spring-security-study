package com.ningning0111.springsecuritydemo3.repository.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ningning0111.springsecuritydemo3.entity.User;
import com.ningning0111.springsecuritydemo3.mapper.UserMapper;
import com.ningning0111.springsecuritydemo3.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @Project: com.ningning0111.springsecuritydemo3.repository.impl
 * @Author: pgthinker
 * @Date: 2023/12/19 19:46
 * @Description:
 */
@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository {
    private final UserMapper userMapper;

    @Override
    public User findByUsername(String username) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_name",username);

        return userMapper.selectOne(userQueryWrapper);
    }

    @Override
    public void saveUser(User user) {
        userMapper.insert(user);
    }
}
