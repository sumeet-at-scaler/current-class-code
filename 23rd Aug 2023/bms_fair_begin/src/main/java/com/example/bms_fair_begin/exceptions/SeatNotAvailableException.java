package com.example.bms_fair_begin.exceptions;

public class SeatNotAvailableException extends Exception {
    public SeatNotAvailableException(){
        super("Seat not available");
    }
}
