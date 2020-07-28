package sampleCode;

class Parent {
 void callme() {
	 System.out.println("Inside A's callme method");
 }
}
class Child1 extends Parent {
 // override callme()
 void callme() {
	 System.out.println("Inside B's callme method");
 }
}
class Child2 extends Parent {
 // override callme()
 void callme() {
	 System.out.println("Inside C's callme method");
 }
}
class DynamicDispatch {
 public static void main(String args[]) {
	 Parent a = new Parent(); // object of type A
	 Child1 b = new Child1(); // object of type B
	 Child2 c = new Child2(); // object of type C
	 
	 Parent r; // obtain a reference of type A
	 
	 r = a; // r refers to an A object
	 a = null;  /*** reference magic ***/
//	 r = null;
	 r.callme(); // calls A's version of callme
	 r = b; // r refers to a B object
	 r.callme(); // calls B's version of callme
	 r = c; // r refers to a C object
	 r.callme(); // calls C's version of callme
 }
}