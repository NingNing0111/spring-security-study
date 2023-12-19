package com.ningning0111.springsecuritydemo3.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ningning0111.springsecuritydemo3.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Project: com.ningning0111.springsecuritydemo3.mapper
 * @Author: pgthinker
 * @Date: 2023/12/19 17:22
 * @Description:
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
