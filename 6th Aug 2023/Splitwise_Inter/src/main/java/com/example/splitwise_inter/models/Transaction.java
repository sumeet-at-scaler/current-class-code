package com.example.splitwise_inter.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// No @Entity becuase no table for transaction
public class Transaction {
    private String from;
    private String to;
    private int amount;

    @Override
    public String toString() {
        return from + " should pay " + amount + " to " + to + "\n";
    }
}
