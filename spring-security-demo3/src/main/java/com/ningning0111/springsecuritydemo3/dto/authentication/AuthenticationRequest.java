package com.ningning0111.springsecuritydemo3.dto.authentication;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project: com.ningning0111.springsecuritydemo3.dto
 * @Author: pgthinker
 * @Date: 2023/12/19 21:05
 * @Description:
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {
    private String username;
    private String password;
}
