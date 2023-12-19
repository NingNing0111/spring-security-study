package com.ningning0111.springsecuritydemo2.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ningning0111.springsecuritydemo2.entity.User;
import com.ningning0111.springsecuritydemo2.mapper.UserMapper;
import com.ningning0111.springsecuritydemo2.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @Project: com.ningning0111.springsecuritydemo2.service.impl
 * @Author: pgthinker
 * @Date: 2023/12/5 01:42
 * @Description:
 */
@Service
public class IUserServiceImpl  implements IUserService {
    private final UserMapper userMapper;

    public IUserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User queryOne(String username) {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("user_name",username);
        return userMapper.selectOne(userQueryWrapper);
    }
}
