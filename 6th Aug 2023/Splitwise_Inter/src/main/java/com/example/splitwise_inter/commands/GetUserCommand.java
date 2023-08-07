package com.example.splitwise_inter.commands;

import com.example.splitwise_inter.controllers.GroupController;
import com.example.splitwise_inter.controllers.UserController;
import com.example.splitwise_inter.dtos.*;
import com.example.splitwise_inter.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// getUser <<userId>>
@Component
public class GetUserCommand implements Command {
    private UserController userController;

    @Autowired
    public GetUserCommand(UserController userController){
        this.userController = userController;
    }


    @Override
    public boolean canExecute(String input) {
        if(input.startsWith("getUser") == false){
            return false;
        }

        if(input.split(" ").length != 2){
            return false;
        }

        String[] arr = input.split(" ");
        try {
            long userId = Long.parseLong(arr[1]);
        } catch(NumberFormatException numberFormatException){
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        String[] arr = input.split(" ");
        long userId = Long.parseLong(arr[1]);

        GetUserRequestDTO requestDTO = new GetUserRequestDTO();
        requestDTO.setUserId(userId);

//        GetUserResponseDTO responseDTO = userController.getUser(requestDTO);
        GetUserResponseDTO responseDTO = userController.getUser(userId);
        if(responseDTO.getResponseStatus() == ResponseStatus.SUCCESS){
            System.out.println("User Id = " + responseDTO.getUserId());
            System.out.println("User Name = " + responseDTO.getUserName());
            System.out.println("User Phone = " + responseDTO.getPhone());
        } else {
            System.out.println("Get User failed with message = " + responseDTO.getMessage());
        }
    }
}
