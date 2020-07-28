package sampleCode;
class Test {
	int i, j;
	
	// call by value 
	public Test() {
		
	}
	void meth(int i, int j) {
		 i *= 2;
		 j /= 2;
	 }
	
	// call by ref	
	 public Test(int i, int j) {
		this.i = i;
		this.j = j;
	}
	void meth(Test ob) {
		 ob.i *= 2;
		 ob.j /= 2;
	}
}
public class ArgumentPassing {
	public static void main(String args[]) {
		 // call by value 
		 Test obj = new Test();		 
		 int a = 15, b = 20;		 
		 System.out.println("a and b before call: " + a + " " + b);		 
		 obj.meth(a, b);		 
		 System.out.println("a and b after call: " + a + " " + b);
		 
		 // call by ref
		 Test ob = new Test(15, 20);
		 System.out.println("a and b before call: " + ob.i + " " + ob.j);		 
		 ob.meth(ob);		 
		 System.out.println("a and b after call: " + ob.i + " " + ob.j);
	}
}
