package com.example.splitwise_beginners.commands;

public interface Command {
    boolean canExecute(String input);
    void execute(String input);
}
