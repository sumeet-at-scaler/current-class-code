package FairWork.Lect_Begin_ParkingLot;

import FairWork.Lect_Begin_ParkingLot.controllers.TicketController;
import FairWork.Lect_Begin_ParkingLot.services.strategies.TicketService;

public class Client {
    public static void main(String[] args) {
        // requirement : generate a ticket on entry gate
        // 10s of objects here
        TicketService ts = new TicketService();
        TicketController tc = new TicketController(ts);
        tc.generateTicket(?, ?, ?);
    }
}

