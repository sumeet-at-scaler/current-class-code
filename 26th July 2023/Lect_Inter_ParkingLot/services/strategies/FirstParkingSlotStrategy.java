package FairWork.Lect_Inter_ParkingLot.services.strategies;

import FairWork.Lect_Inter_ParkingLot.models.ParkingLot;
import FairWork.Lect_Inter_ParkingLot.models.ParkingSlot;
import FairWork.Lect_Inter_ParkingLot.models.enums.VehicleType;
import FairWork.Lect_Inter_ParkingLot.repositiories.ParkingLotRepository;
import FairWork.Lect_Inter_ParkingLot.repositiories.ParkingSlotRepository;
import FairWork.Lect_Inter_ParkingLot.models.enums.ParkingSpotStatus;

import java.util.List;

public class FirstParkingSlotStrategy implements ParkingSlotAllocationStrategy{
    private ParkingLotRepository plRepo;
    private ParkingSlotRepository psRepo;

    public FirstParkingSlotStrategy(ParkingLotRepository plRepo, ParkingSlotRepository psRepo){
        this.plRepo = plRepo;
        this.psRepo = psRepo;
    }
    @Override
    public ParkingSlot assignParkingSlot(Long gateId, VehicleType vehicleType) {
        ParkingLot parkingLot = plRepo.getParkingLotByGateId(gateId);
        List<ParkingSlot> allParkingSlots = psRepo.getAllParkingSlotsByParkingLotId(parkingLot.getId());

        for(ParkingSlot ps: allParkingSlots){
            if(ps.getParkingSlotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
            ps.getSupportedVehicleType().equals(vehicleType)){
                return ps;
            }
        }

        return null;
    }
}
