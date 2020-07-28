package sampleCode;

class BoxConstructorExp {
	 double width;
	 double height;
	 double depth;
	 
	 // without parameter 
	 public BoxConstructorExp() {
		width = 10;
		height = 20;
		depth = 30;
	}
	 
	// with parameter  
	public BoxConstructorExp(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	// Notice this constructor. It takes an object of type Box.
	public BoxConstructorExp(BoxConstructorExp ob) { // pass object to constructor
		 width = ob.width;
		 height = ob.height;
		 depth = ob.depth;
	 }
    /*** constructor overloading ***/
	
	double calculateVolume() {
		double vol = (width * height * depth);
		return vol;
	 }
}
public class Constructor {
	public static void main(String args[]) {
		// Create Objects
		BoxConstructorExp mybox1 = new BoxConstructorExp();
		BoxConstructorExp mybox2 = new BoxConstructorExp(3.0, 6.0, 9.0);
		BoxConstructorExp mybox3 = new BoxConstructorExp(mybox1); // copy constructor
		
		// call method - with return 
		System.out.println(mybox1.calculateVolume());
		System.out.println(mybox2.calculateVolume());
		System.out.println(mybox3.calculateVolume());
	}
}
