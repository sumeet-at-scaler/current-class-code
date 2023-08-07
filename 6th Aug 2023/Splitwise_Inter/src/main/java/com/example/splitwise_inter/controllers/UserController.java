package com.example.splitwise_inter.controllers;

import com.example.splitwise_inter.dtos.*;
import com.example.splitwise_inter.dtos.ResponseStatus;
import com.example.splitwise_inter.models.User;
import com.example.splitwise_inter.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// 5 steps
// 1. Search Maven Repository for Spring Boot Starter Web
// 2. Update Pom and refresh maven
// 3. Controller to RestController
// 4. Update methods with get or post mapping
// 5. RequestBody or RequestParam

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user/register/")
    public RegisterUserResponseDTO registerUser(@RequestBody() RegisterUserRequestDTO requestDTO){
        RegisterUserResponseDTO responseDTO = new RegisterUserResponseDTO();

        try{
            User user = new User();
            user.setUserName(requestDTO.getUserName());
            user.setPhone(requestDTO.getPhone());
            user.setPassword(requestDTO.getPassword());

            User savedUser = userService.registerUser(user);
            responseDTO.setUserId(savedUser.getId());
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("User created successfully");
        } catch(Exception ex){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(ex.getMessage());
        }


        return responseDTO;
    }

    @GetMapping("/user/get/")
    public GetUserResponseDTO getUser(@RequestParam() Long userId){
        GetUserResponseDTO responseDTO = new GetUserResponseDTO();

        try {
            User user = userService.getUser(userId);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
            responseDTO.setMessage("User retrieved successfully");
            responseDTO.setUserName(user.getUserName());
            responseDTO.setUserId(user.getId());
            responseDTO.setPhone(user.getPhone());
        } catch(Exception ex){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setMessage(ex.getMessage());
        }

        return responseDTO;
    }
}
