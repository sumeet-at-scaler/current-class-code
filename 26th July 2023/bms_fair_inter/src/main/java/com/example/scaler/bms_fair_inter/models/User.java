package com.example.scaler.bms_fair_inter.models;

import com.example.scaler.bms_fair_inter.models.enums.Role;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User extends BaseModel {
    private String userName;
    private String password;
    private String name;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Role> roles;
}
