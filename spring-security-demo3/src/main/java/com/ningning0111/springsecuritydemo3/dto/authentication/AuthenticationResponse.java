package com.ningning0111.springsecuritydemo3.dto.authentication;

import com.fasterxml.jackson.annotation.JsonProperty;
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
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthenticationResponse {
    @JsonProperty("access_token")
    private String accessToken;
}
