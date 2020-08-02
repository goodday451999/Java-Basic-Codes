package designPatternBuilder;

public class MobilePhone {
	private String os;
	private int ram;
	private int battery;
	private double camera;
	private double screenSize;
	public MobilePhone(String os, int ram, int battery, double camera, double screenSize) {
		super();
		this.os = os;
		this.ram = ram;
		this.battery = battery;
		this.camera = camera;
		this.screenSize = screenSize;
	}
	public String getPhone() {
		return "Your Phone: [" + "OS = " + os + " RAM = " + ram + " Battery = " + 
	battery + " Camera = " + camera + " ScreenSize = " + screenSize + "]";
	}
}
