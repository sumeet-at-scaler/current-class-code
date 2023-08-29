package com.example.splitwise_beginners.dtos;

import com.example.splitwise_beginners.models.Transaction;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class SettleGroupResponseDTO {
    private List<Transaction> transactions;
    private ResponseStatus responseStatus;
    private String message;
}
