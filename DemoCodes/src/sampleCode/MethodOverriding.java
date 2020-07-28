package sampleCode;
class A {
	 int i, j;
	 A(int a, int b) {
		i = a;
		j = b;
	 }
	 // display i and j
	 void show() {
		 System.out.println("i and j: " + i + " " + j);
	 }
	 
	 // void return type
	 void showAdd() {
		 System.out.println("i + j: " + (i + j));
	 }
}
class B extends A {
	 int k;
	 B(int a, int b, int c) {
		 super(a, b); // to access the inherited class var
		 k = c;
	 }
	 // display k – this overrides show() in A
	 void show(String msg) {
		 System.out.println(msg + k);
	 }
	 
	 // int return type
	 int showAdd(int num) {
		 return (k + num);
	 }
}
public class MethodOverriding {
	public static void main(String args[]) {
		 A ob = new A(10, 20);
		 ob.show();
		 
		 B subOb = new B(1, 2, 3);
		 subOb.show("k is "); // this calls show() in B
		 System.out.println(subOb.showAdd(5));
		 subOb.show(); // this calls show() in A from B
	}
}
