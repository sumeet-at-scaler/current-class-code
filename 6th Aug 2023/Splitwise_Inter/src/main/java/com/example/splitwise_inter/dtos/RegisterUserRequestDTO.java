package com.example.splitwise_inter.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserRequestDTO {
    private String userName;
    private String phone;
    private String password;
}
