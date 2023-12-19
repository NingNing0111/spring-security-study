package com.ningning0111.springsecuritydemo3.dto.register;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Project: com.ningning0111.springsecuritydemo3.dto.register
 * @Author: pgthinker
 * @Date: 2023/12/19 21:18
 * @Description:
 */
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterResponse {
    private String message;
}
