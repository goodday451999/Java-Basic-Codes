package designPatternBuilder;

public class MobilePhoneBuilder{
	private String os;
	private int ram;
	private int battery;
	private double camera;
	private double screenSize;
	public MobilePhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public MobilePhoneBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public MobilePhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public MobilePhoneBuilder setCamera(double camera) {
		this.camera = camera;
		return this;
	}
	public MobilePhoneBuilder setScreenSize(double screenSize) {
		this.screenSize = screenSize;
		return this;
	}
	public MobilePhone getBuiltPhone() {
		return new MobilePhone(os, ram, battery, camera, screenSize);
	}
	
}
