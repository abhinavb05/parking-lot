import java.util.*;
public class User {
	private Vehicle vehicle;
	private Ticket ticket;
	private ParkingLot parkingLot;
	
	User(Vehicle vehicle){
		this.vehicle = vehicle;
	}
	
	void setTicket(ParkingLot parkingLot) {
		Manager manager = new Manager(parkingLot);
		this.ticket = manager.findVacantSlot(vehicle);
		this.parkingLot = parkingLot;
	}
	
	Ticket getTicket() {
		return ticket;
	}
	
	void parkVehicle() {
		Floor allocatedFloor = parkingLot.getFloors().get(ticket.getFloorNumber());
		Slot allocatedSlot = allocatedFloor.getSlots().get(ticket.getSlotNumber());
		if(!allocatedSlot.getVacancy()) {
			allocatedSlot.reverseVacancy();
		}else {
			//slot not vaccant
		}
	}
	
	void unparkVehicle() {
		Floor allocatedFloor = parkingLot.getFloors().get(ticket.getFloorNumber());
		Slot allocatedSlot = allocatedFloor.getSlots().get(ticket.getSlotNumber());
		if(allocatedSlot.getVacancy()) {
			allocatedSlot.reverseVacancy();
		}else {
			//slot already vaccant
		}
	}
}
