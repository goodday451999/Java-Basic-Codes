package designPatternFactory;

public class Car extends Vehicle{
    int wheel;
	
	public int getWheel() {
		return wheel;
	}	
	
	public Car(int wheel) {
		super();
		this.wheel = wheel;
	}

	@Override
	public void getDetails() {
		System.out.println("Here is a Car with " + getWheel() + " wheels");
		
	}


}
