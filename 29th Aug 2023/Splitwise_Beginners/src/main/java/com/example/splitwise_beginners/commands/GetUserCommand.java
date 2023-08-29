package com.example.splitwise_beginners.commands;

import com.example.splitwise_beginners.controllers.UserController;
import com.example.splitwise_beginners.dtos.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GetUserCommand implements Command {
    private UserController userController;

    @Autowired
    public GetUserCommand(UserController userController){
        this.userController = userController;
    }

    @Override
    public boolean canExecute(String input) {
        if(!input.startsWith("get-user")){
            return false;
        }

        if(input.split(" ").length != 2){
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        String[] parts = input.split(" ");

        GetUserRequestDTO requestDTO = new GetUserRequestDTO();
        requestDTO.setUserId(Long.parseLong(parts[1]));


        GetUserResponseDTO responseDTO = userController.getUser(requestDTO);
        if(responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Name = " + responseDTO.getName());
            System.out.println("UName = " + responseDTO.getUname());
        } else {
            System.out.println("User retrieval failed with message " + responseDTO.getMessage());
        }
    }
}
