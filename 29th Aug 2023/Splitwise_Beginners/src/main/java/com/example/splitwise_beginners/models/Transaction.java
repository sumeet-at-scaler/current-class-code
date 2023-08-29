package com.example.splitwise_beginners.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
// No Entity -> Not in db, only show to the user
public class Transaction {
    private String from;
    private String to;
    private int amount;

    @Override
    public String toString() {
        return from + " should pay " + amount + " to " + to + "\n";
    }

    public Transaction(String from, String to, int amount){
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}
