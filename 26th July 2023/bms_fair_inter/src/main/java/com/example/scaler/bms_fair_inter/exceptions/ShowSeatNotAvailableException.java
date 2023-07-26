package com.example.scaler.bms_fair_inter.exceptions;

public class ShowSeatNotAvailableException extends Exception {
    public ShowSeatNotAvailableException(){
        super("One of the selected seats is not available");
    }
}
