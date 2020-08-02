package designPatternFactory;

public class VehicleFactory {
	public Vehicle getInstance(String type, int wheel) {
		if(type == "car") {
			return new Car(wheel);
		}
		else if(type == "bike") {
			return new Bike(wheel);
		}
		else {
			return null;
		}
	}
}
