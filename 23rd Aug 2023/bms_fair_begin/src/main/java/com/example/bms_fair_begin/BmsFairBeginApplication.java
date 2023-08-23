package com.example.bms_fair_begin;

import com.example.bms_fair_begin.controllers.TicketController;
import com.example.bms_fair_begin.services.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BmsFairBeginApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmsFairBeginApplication.class, args);
    }

}
