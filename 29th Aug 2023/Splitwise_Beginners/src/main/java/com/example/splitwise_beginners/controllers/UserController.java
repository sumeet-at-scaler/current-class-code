package com.example.splitwise_beginners.controllers;

import com.example.splitwise_beginners.dtos.*;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    public CreateUserResponseDTO createUser(CreateUserRequestDTO requestDTO){
        CreateUserResponseDTO responseDTO = new CreateUserResponseDTO();
        responseDTO.setMessage("Not implemented yet");
        responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        return responseDTO;
    }

    public GetUserResponseDTO getUser(GetUserRequestDTO requestDTO){
        GetUserResponseDTO responseDTO = new GetUserResponseDTO();
        responseDTO.setMessage("Not implemented yet");
        responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        return responseDTO;
    }
}
