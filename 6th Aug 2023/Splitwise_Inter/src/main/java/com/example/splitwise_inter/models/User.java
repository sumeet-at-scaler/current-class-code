package com.example.splitwise_inter.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class User extends BaseModel{
    private String userName;
    private String phone;
    private String password;
}
