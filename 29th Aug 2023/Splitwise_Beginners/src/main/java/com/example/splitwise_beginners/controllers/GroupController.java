package com.example.splitwise_beginners.controllers;

import com.example.splitwise_beginners.dtos.ResponseStatus;
import com.example.splitwise_beginners.dtos.SettleGroupRequestDTO;
import com.example.splitwise_beginners.dtos.SettleGroupResponseDTO;
import org.springframework.stereotype.Controller;

@Controller
public class GroupController {
    public SettleGroupResponseDTO settleGroup(SettleGroupRequestDTO requestDTO){
        SettleGroupResponseDTO responseDTO = new SettleGroupResponseDTO();
        responseDTO.setMessage("Not implemented yet");
        responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        return responseDTO;
    }
}
