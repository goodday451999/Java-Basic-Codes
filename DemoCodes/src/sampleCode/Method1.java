package sampleCode;

class BoxMethodExp {
	 public double width;
	 public double height;
	 public double depth;
	 
	 void calculateVolume() {
		 System.out.println("Vol = " + (width * height * depth));
	 }
	 
}

public class Method1 {
	public static void main(String args[]) {
		// Create Objects
		BoxMethodExp mybox1 = new BoxMethodExp();
		BoxMethodExp mybox2 = new BoxMethodExp();
		
		// assign values to mybox1's instance variables
		mybox1.width = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		/* assign different values to mybox2's
		instance variables */
		mybox2.width = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		// call method - without parameter
		mybox1.calculateVolume();
		mybox2.calculateVolume();
	}
}
