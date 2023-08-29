package com.example.splitwise_beginners.services;

import com.example.splitwise_beginners.models.User;
import com.example.splitwise_beginners.repostiories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User createUser(String name, String uname, String pwd){
        User user = new User();
        user.setName(name);
        user.setUname(uname);
        user.setPassword(pwd);

        User savedUser = userRepository.save(user);
        return savedUser;
    }

    public User getUser(Long userId) throws Exception {
        Optional<User> userOptional = userRepository.findById(userId);
        if(userOptional.isEmpty()){
            throw new Exception("User not found");
        } else {
            return userOptional.get();
        }
    }
}
