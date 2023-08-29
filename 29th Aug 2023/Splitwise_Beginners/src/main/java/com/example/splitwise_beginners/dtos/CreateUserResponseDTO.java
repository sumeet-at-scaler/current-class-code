package com.example.splitwise_beginners.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateUserResponseDTO {
    private Long userId;
    private ResponseStatus responseStatus;
    private String message;
}
