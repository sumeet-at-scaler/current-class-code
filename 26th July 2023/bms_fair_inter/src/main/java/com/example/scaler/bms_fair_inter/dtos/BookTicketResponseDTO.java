package com.example.scaler.bms_fair_inter.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    private Long ticketId;
    private ResponseStatus status;
    private String message;
}
