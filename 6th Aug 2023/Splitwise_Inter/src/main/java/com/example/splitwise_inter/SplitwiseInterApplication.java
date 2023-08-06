package com.example.splitwise_inter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SplitwiseInterApplication {

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseInterApplication.class, args);
    }

    // Inputs of application
    // exit
    // settleGroup <<groupId>>
    // registerUser <<name>> <<phone>> <<pwd>>
    // getUser <<userId>>
}
