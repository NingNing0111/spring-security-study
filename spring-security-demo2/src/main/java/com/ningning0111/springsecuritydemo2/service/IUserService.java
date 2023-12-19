package com.ningning0111.springsecuritydemo2.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ningning0111.springsecuritydemo2.entity.User;

/**
 * @Project: com.ningning0111.springsecuritydemo2.service
 * @Author: pgthinker
 * @Date: 2023/12/5 01:41
 * @Description:
 */
public interface IUserService {
    User queryOne(String username);
}
