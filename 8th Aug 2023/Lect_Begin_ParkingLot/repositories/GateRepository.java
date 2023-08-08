package FairWork.Lect_Begin_ParkingLot.repositories;

import FairWork.Lect_Begin_ParkingLot.models.Gate;

import java.util.Optional;

// empty for students to finish
public class GateRepository {

    public Optional<Gate> fetchGateById(Long gateId){
        // hit the db to get the gate
        return Optional.empty();
    }

    // if repo returned gate, it is not appropriately advertised to service that a null gate might be returned also
}
