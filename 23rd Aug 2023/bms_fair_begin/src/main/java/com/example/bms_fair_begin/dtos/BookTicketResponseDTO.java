package com.example.bms_fair_begin.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {
    private Long idOfTheDummyTicket;
    private ResponseStatus status;
    private String message;
}
