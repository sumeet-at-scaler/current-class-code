package com.example.splitwise_inter.commands;

public interface Command {
    boolean canExecute(String input);
    void execute(String input);
}
