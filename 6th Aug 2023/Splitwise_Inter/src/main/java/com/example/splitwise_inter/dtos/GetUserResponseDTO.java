package com.example.splitwise_inter.dtos;

import com.example.splitwise_inter.models.Transaction;
import com.example.splitwise_inter.models.User;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class GetUserResponseDTO {
    private Long userId;
    private String userName;
    private String phone;

    // password skipped

    private ResponseStatus responseStatus;
    private String message;
}
