package com.example.scaler.bms_fair_inter.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Test extends BaseModel{
    private String name;
}
