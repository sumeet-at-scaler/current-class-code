package FairWork.Lect_Begin_ParkingLot.services.strategies;

import FairWork.Lect_Begin_ParkingLot.models.Booth;
import FairWork.Lect_Begin_ParkingLot.models.Gate;
import FairWork.Lect_Begin_ParkingLot.models.ParkingLot;
import FairWork.Lect_Begin_ParkingLot.models.enums.ParkingBoothStatus;
import FairWork.Lect_Begin_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Begin_ParkingLot.repositories.BoothRepository;
import FairWork.Lect_Begin_ParkingLot.repositories.ParkingLotRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class FarthestEmptyBoothStrategy implements BoothAllocationStrategy {
    private ParkingLotRepository parkingLotRepository;
    private BoothRepository boothRepository;

    public FarthestEmptyBoothStrategy(ParkingLotRepository parkingLotRepository, BoothRepository boothRepository){
        this.parkingLotRepository = parkingLotRepository;
        this.boothRepository = boothRepository;
    }

    @Override
    public Optional<Booth> assignBooth(VehicleType vehicleType, Gate gate) {
        ParkingLot parkingLot = parkingLotRepository.fetchByGateId(gate.getId());
        List<Booth> parkingBooths = boothRepository.fetchAllBoothsByParkingLot(parkingLot.getId());

        Collections.reverse(parkingBooths);

        for(Booth booth: parkingBooths){
            if(booth.getBoothStatus().equals(ParkingBoothStatus.AVAILABLE) &&
               booth.getSupportedVehicleType().equals(vehicleType)){
                return Optional.of(booth);
            }
        }

        return Optional.empty();
    }
}
