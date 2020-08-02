package designPatternFactory;

public class FactoryMain {
	public static void main(String args[]) {
		VehicleFactory vf = new VehicleFactory();
		
		Vehicle vBike = vf.getInstance("bike", 2);
		vBike.getDetails();
		
		Vehicle vCar = vf.getInstance("car", 4);
		vCar.getDetails();
	}
}
