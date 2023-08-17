package com.example.bms_fair_begin.models;

import com.example.bms_fair_begin.models.enums.PaymentMode;
import com.example.bms_fair_begin.models.enums.PaymentStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private int amount;

    private String transactionId;

    @Enumerated(EnumType.ORDINAL)
    private PaymentMode paymentMode;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    @OneToOne
    private Ticket ticket;
}
