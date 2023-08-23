package com.example.bms_fair_begin.exceptions;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(){
        super("Invalid user id");
    }
}
