package sampleCode;

class BoxMethodExp2 {
	 double width;
	 double height;
	 double depth;
	 
	 double calculateVolume() {
		double vol = (width * height * depth);
		return vol;
	 }

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setDepth(double depth) {
		this.depth = depth;
	}
	 
}

public class Method2 {
	public static void main(String args[]) {
		// Create Objects
		BoxMethodExp2 mybox1 = new BoxMethodExp2();
		BoxMethodExp2 mybox2 = new BoxMethodExp2();
		
		// assign values to mybox1's instance variables
		mybox1.setWidth(10);
		mybox1.setHeight(20);
		mybox1.setDepth(15);
		/* assign different values to mybox2's
		instance variables */
		mybox2.setWidth(3);
		mybox2.setHeight(6);
		mybox2.setDepth(9);
		
		// call method - with return 
		System.out.println(mybox1.calculateVolume());
		System.out.println(mybox2.calculateVolume());
	}
}
