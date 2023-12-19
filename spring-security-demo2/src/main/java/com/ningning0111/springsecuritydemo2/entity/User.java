package com.ningning0111.springsecuritydemo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;

/**
 * @Project: com.ningning0111.springsecuritydemo2.entity
 * @Author: pgthinker
 * @Date: 2023/12/5 01:25
 * @Description:
 */
@Data
@TableName("users")
public class User implements UserDetails {
    @TableId(value = "user_id", type = IdType.AUTO)
    private Integer userId;
    @TableField(value = "user_name")
    private String username;
    @TableField(value = "user_password")
    private String password;
    @Override
    public String getPassword(){
        return password;
    }
    @Override
    public String getUsername(){
        return username;
    }
    // 用户的相关操作先忽略
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
