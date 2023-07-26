package com.example.scaler.bms_fair_inter.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(){
        super("user not found");
    }
}
