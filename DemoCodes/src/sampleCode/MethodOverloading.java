package sampleCode;

class MethodOverloadExp{
	void test() {
		System.out.println("No parameters");
	}
	
	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}
	
	// Overload test for a double parameter
	 void test(double a) {
		 System.out.println("Inside test(double) a: " + a);
	 }
	 
	// Overload test for a double parameter return
	 double test(double a, double b) {
		 System.out.println("Inside test(double) a, b - return ");
		 return a * b;
	 }
}

public class MethodOverloading {
	public static void main(String args[]) {
		MethodOverloadExp ob = new MethodOverloadExp();
		 ob.test();
		 ob.test(10, 20);
		 // automatic data type change
		 int i = 88;
		 ob.test(i); // this will invoke test(double)
		 
		 ob.test(123.2); // this will invoke test(double)
		 System.out.println(ob.test(2.5, 4.5));
	}
}
