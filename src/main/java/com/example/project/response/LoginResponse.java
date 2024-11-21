package com.example.project.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponse {

    private String accessToken;
    private String tokenType = "Bearer";
    private String role;
    private Long userId; // Add userId field



    public LoginResponse(String accessToken, Long userId, String role) {
        this.accessToken = accessToken;
        this.userId = userId;
        this.role = role;
    }

}
