public class Truck implements Vehicle{
	
	private int regNumber;
	private String color;
	
	Truck (int regNumber, String color){
		this.regNumber = regNumber;
		this.color = color;
	}

	@Override
	public int getRegNumber() {
		return regNumber;
	}

	@Override
	public String getColor() {
		return color;
	}
}
