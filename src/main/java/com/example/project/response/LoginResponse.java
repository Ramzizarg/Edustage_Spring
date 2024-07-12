package com.example.project.response;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginResponse {

    private String accessToken;
    private String tokenType = "Bearer";
    private String role;


    public LoginResponse(String accessToken, String role) {
        this.accessToken = accessToken;
        this.role = role;
    }

}
