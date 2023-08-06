package com.example.splitwise_inter.commands;

import com.example.splitwise_inter.controllers.GroupController;
import com.example.splitwise_inter.controllers.UserController;
import com.example.splitwise_inter.dtos.*;
import com.example.splitwise_inter.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// registerUser <<name>> <<phone>> <<pwd>>
@Component
public class RegisterUserCommand implements Command {
    private UserController userController;

    @Autowired
    public RegisterUserCommand(UserController userController){
        this.userController = userController;
    }


    @Override
    public boolean canExecute(String input) {
        if(input.startsWith("registerUser") == false){
            return false;
        }

        if(input.split(" ").length != 4){
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        String[] arr = input.split(" ");

        RegisterUserRequestDTO requestDTO = new RegisterUserRequestDTO();
        requestDTO.setUserName(arr[1]);
        requestDTO.setPhone(arr[2]);
        requestDTO.setPassword(arr[3]);

        RegisterUserResponseDTO responseDTO = userController.registerUser(requestDTO);
        if(responseDTO.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println("User created with id " + responseDTO.getUserId());
        } else {
            System.out.println("Get User failed with message = " + responseDTO.getMessage());
        }
    }
}
