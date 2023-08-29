package com.example.splitwise_beginners.controllers;

import com.example.splitwise_beginners.dtos.*;
import com.example.splitwise_beginners.dtos.ResponseStatus;
import com.example.splitwise_beginners.models.User;
import com.example.splitwise_beginners.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/create/")
    public CreateUserResponseDTO createUser(@RequestBody() CreateUserRequestDTO requestDTO){
        CreateUserResponseDTO responseDTO = new CreateUserResponseDTO();

        try {
            User savedUser = userService.createUser(requestDTO.getName(), requestDTO.getUname(), requestDTO.getPwd());
            responseDTO.setMessage("User created successfully");
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setUserId(savedUser.getId());
        } catch(Exception ex) {
            responseDTO.setMessage(ex.getMessage());
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDTO;
    }

    @GetMapping("/user/get/")
    public GetUserResponseDTO getUser(@RequestParam() Long userId){
        GetUserResponseDTO responseDTO = new GetUserResponseDTO();

        try {
            User user = userService.getUser(userId);
            responseDTO.setMessage("User found successfully");
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);

            responseDTO.setName(user.getName());
            responseDTO.setUname(user.getUname());
        } catch(Exception ex) {
            responseDTO.setMessage(ex.getMessage());
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDTO;
    }
}
