public class Car implements Vehicle{
	
	private int regNumber;
	private String color;
	
	Car(int regNumber,String color) {
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
