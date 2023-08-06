package com.example.splitwise_inter.dtos;

import com.example.splitwise_inter.models.Transaction;
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
