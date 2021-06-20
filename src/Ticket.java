import java.util.*;
public class Ticket {
	private String parkingLotId;
	private int floorNumber;
	private int slotNumber;
	
	Ticket(String parkingLotId,int floorNumber,int slotNumber){
		this.parkingLotId = parkingLotId;
		this.floorNumber = floorNumber;
		this.slotNumber = slotNumber;
	}
	
	public String getTicketId() {
		return parkingLotId+"_"+floorNumber+"_"+slotNumber;
	}
	
	public String getPatkingLotId() {
		return parkingLotId;
	}
	
	public int getFloorNumber() {
		return floorNumber;
	}
	
	public int getSlotNumber() {
		return slotNumber;
	}
}
