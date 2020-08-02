package designPatternFactory;

public class Bike extends Vehicle{
	int wheel;
	
	public int getWheel() {
		return wheel;
	}	

	public Bike(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public void getDetails() {
		System.out.println("Here is a Bike with " + getWheel() + " wheels");
		
	}

}
