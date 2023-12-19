package com.ningning0111.springsecuritydemo3.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @Project: com.ningning0111.springsecuritydemo3.entity
 * @Author: pgthinker
 * @Date: 2023/12/19 16:52
 * @Description:
 */
@Data
@TableName("users")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    @TableId(value = "user_id",type = IdType.AUTO)
    private Integer uId;
    @TableField(value = "user_name")
    private String username;
    @TableField(value = "user_password")
    private String password;

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
