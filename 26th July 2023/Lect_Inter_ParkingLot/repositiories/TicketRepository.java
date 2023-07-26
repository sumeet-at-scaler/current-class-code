package FairWork.Lect_Inter_ParkingLot.repositiories;

import FairWork.Lect_Inter_ParkingLot.models.Ticket;

import java.util.HashMap;

public class TicketRepository {

    private HashMap<Long, Ticket> ticketTableMock = new HashMap<>();
    private Long autoIncrementId = 0L;

    public void save(Ticket ticket){
        // ideally hit the db here (ORM such as JPA), but in this project a hack
        autoIncrementId++;
        ticketTableMock.put(autoIncrementId, ticket);
        ticket.setId(autoIncrementId);
    }
}
