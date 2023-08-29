package com.example.splitwise_beginners;

import com.example.splitwise_beginners.commands.CommandRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseBeginnersApplication implements CommandLineRunner {
    private CommandRegistry commandRegistry;

    @Autowired
    public SplitwiseBeginnersApplication(CommandRegistry commandRegistry){
        this.commandRegistry = commandRegistry;
    }

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseBeginnersApplication.class, args);

    }

    // create-user <name> <uname> <pwd>
    // get-user <user-id>
    // settle-group <group-name>

    @Override
    public void run(String... args) throws Exception {
        Scanner scn = new Scanner(System.in);
        while(true) {
            String input = scn.nextLine();
            if(input.equals("quit")){
                break;
            } else {
                commandRegistry.process(input);
            }
        }
    }
}
