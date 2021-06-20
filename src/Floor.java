import java.util.*;
public class Floor {
	private int number;
	private List<Slot> slots;
	
	Floor(int number,List<Slot> slots){
		this.number = number;
		this.slots = slots;
	}
	
	public int getNumber() {
		return number;
	}
	
	public List<Slot> getSlots(){
		return slots;
	}
}
