package com.ningning0111.springsecuritydemo3.dto.register;

import lombok.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project: com.ningning0111.springsecuritydemo3.dto
 * @Author: pgthinker
 * @Date: 2023/12/19 21:05
 * @Description:
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String username;
    private String password;
}
