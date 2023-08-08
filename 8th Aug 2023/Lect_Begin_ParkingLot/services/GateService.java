package FairWork.Lect_Begin_ParkingLot.services;

import FairWork.Lect_Begin_ParkingLot.exceptions.GateNotFoundException;
import FairWork.Lect_Begin_ParkingLot.models.Gate;
import FairWork.Lect_Begin_ParkingLot.models.Ticket;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Begin_ParkingLot.repositories.GateRepository;
import FairWork.Lect_Begin_ParkingLot.repositories.TicketRepository;

import java.util.Optional;

public class GateService {
    private GateRepository gateRepository;

    public GateService(GateRepository gateRepository){
        this.gateRepository = gateRepository;
    }

    public Gate getGateById(Long gateId) throws GateNotFoundException {
        Optional<Gate> gateWrapper = gateRepository.fetchGateById(gateId);

        if(gateWrapper.isPresent()){
            return gateWrapper.get();
        } else {
            throw new GateNotFoundException();
        }
    }
}
