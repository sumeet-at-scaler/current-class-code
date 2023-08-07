package com.example.splitwise_inter;

import com.example.splitwise_inter.commands.CommandRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseInterApplication implements CommandLineRunner {
    private CommandRegistry commandRegistry;

    @Autowired
    public SplitwiseInterApplication(CommandRegistry commandRegistry){
        this.commandRegistry = commandRegistry;
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseInterApplication.class, args);
    }

    // Inputs of application
    // exit
    // settleGroup <<groupId>>
    // registerUser <<name>> <<phone>> <<pwd>>
    // getUser <<userId>>


    @Override
    public void run(String... args) throws Exception {
        Scanner scn = new Scanner(System.in);
        while(true){
            String input = scn.nextLine();
            commandRegistry.process(input);
        }
    }
}
