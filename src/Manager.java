import java.util.*;
public class Manager {
	private ParkingLot parkingLot;
	
	Manager(ParkingLot parkingLot){
		this.parkingLot = parkingLot;
	}
	
	public Ticket findVacantSlot(Vehicle vehicle) {
		List<Floor> floors = parkingLot.getFloors();
		for(int i = 0;i < floors.size(); i++) {
			List<Slot> slots = floors.get(i).getSlots();
			for(int j = 0;j < slots.size(); j++) {
				Slot slot = slots.get(j);
				if(slot.getVehicleType() == vehicle && slot.getVacancy()) {
					return new Ticket(parkingLot.getId(),i,j);
				}
			}
		}
		return null;
	}
}
