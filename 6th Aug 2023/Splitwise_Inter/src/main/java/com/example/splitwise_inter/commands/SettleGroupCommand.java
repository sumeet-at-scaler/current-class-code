package com.example.splitwise_inter.commands;

import com.example.splitwise_inter.controllers.GroupController;
import com.example.splitwise_inter.dtos.ResponseStatus;
import com.example.splitwise_inter.dtos.SettleGroupRequestDTO;
import com.example.splitwise_inter.dtos.SettleGroupResponseDTO;
import com.example.splitwise_inter.models.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

// settleGroup <<groupId>>
@Component
public class SettleGroupCommand implements Command {
    private GroupController groupController;

    @Autowired
    public SettleGroupCommand(GroupController groupController){
        this.groupController = groupController;
    }

    @Override
    public boolean canExecute(String input) {
        if(input.startsWith("settleGroup") == false){
            return false;
        }

        if(input.split(" ").length != 2){
            return false;
        }

        String[] arr = input.split(" ");
        try {
            long groupId = Long.parseLong(arr[1]);
        } catch(NumberFormatException numberFormatException){
            return false;
        }

        return true;
    }

    @Override
    public void execute(String input) {
        String[] arr = input.split(" ");
        long groupId = Long.parseLong(arr[1]);

        SettleGroupRequestDTO requestDTO = new SettleGroupRequestDTO();
        requestDTO.setGroupId(groupId);

        SettleGroupResponseDTO responseDTO = groupController.settleGroup(requestDTO);
        if(responseDTO.getResponseStatus() == ResponseStatus.SUCCESS){
            List<Transaction> transactions = responseDTO.getTransactions();
            for(Transaction transaction: transactions){
                System.out.println(transaction);
            }
        } else {
            System.out.println("Settle group failed with message = " + responseDTO.getMessage());
        }
    }
}
