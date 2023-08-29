package com.example.splitwise_beginners.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserRequestDTO {
    private String name;
    private String uname;
    private String pwd;
}
