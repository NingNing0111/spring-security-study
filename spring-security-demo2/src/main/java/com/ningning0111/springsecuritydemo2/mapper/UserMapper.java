package com.ningning0111.springsecuritydemo2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ningning0111.springsecuritydemo2.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Project: com.ningning0111.springsecuritydemo2.mapper
 * @Author: pgthinker
 * @Date: 2023/12/5 01:38
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
