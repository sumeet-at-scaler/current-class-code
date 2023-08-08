package FairWork.Lect_Begin_ParkingLot;

import FairWork.Lect_Begin_ParkingLot.controllers.TicketController;
import FairWork.Lect_Begin_ParkingLot.repositories.TicketRepository;
import FairWork.Lect_Begin_ParkingLot.services.TicketService;


public class Client {
    public static void main(String[] args) {
        // problem of dependency injection
        TicketRepository tr = new TicketRepository();
        TicketService ts = new TicketService(tr);
        TicketController tc = new TicketController(ts);
        tc.generateTicket(null);

    }
}

