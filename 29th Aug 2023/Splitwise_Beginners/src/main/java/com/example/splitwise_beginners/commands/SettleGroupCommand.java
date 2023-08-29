package com.example.splitwise_beginners.commands;

import com.example.splitwise_beginners.controllers.GroupController;
import com.example.splitwise_beginners.controllers.UserController;
import com.example.splitwise_beginners.dtos.*;
import com.example.splitwise_beginners.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SettleGroupCommand implements Command {
    private GroupController groupController;

    @Autowired
    public SettleGroupCommand(GroupController groupController){
        this.groupController = groupController;
    }

    @Override
    public boolean canExecute(String input) {
        if(!input.startsWith("settle-group")){
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

        SettleGroupRequestDTO requestDTO = new SettleGroupRequestDTO();
        requestDTO.setGroupName(parts[1]);

        SettleGroupResponseDTO responseDTO = groupController.settleGroup(requestDTO);
        if(responseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            List<Transaction> transactions = responseDTO.getTransactions();
            for(Transaction t: transactions){
                System.out.println(t);
            }
        } else {
            System.out.println("Group settlement failed with message " + responseDTO.getMessage());
        }
    }
}
