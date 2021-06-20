public class Slot {
	private Vehicle type;
	private int number;
	private boolean isVacant;
	
	Slot(Vehicle type,int number){
		this.type = type;
		this.number = number;
		isVacant = true;
	}
	
	public Vehicle getVehicleType() {
		return type;
	}
	
	public int getNumber() {
		return number;
	}
	
	public boolean getVacancy() {
		return this.isVacant;
	}
	
	public void reverseVacancy() {
		isVacant = !isVacant;
	}
}
