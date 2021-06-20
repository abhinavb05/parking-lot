import java.util.*;
public class ParkingLot {
	private String id;
	private List<Floor> floors;
	
	ParkingLot(String id,List<Floor> floors){
		this.id = id;
		this.floors = floors;
	}
	
	public String getId() {
		return id;
	}
	
	public List<Floor> getFloors(){
		return floors;
	}
}
