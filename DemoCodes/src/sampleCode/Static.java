package sampleCode;

class UseStatic {
	 static int a = 3;
//	 a = a +  1; //can't do this
//	 a = 6;
	 static int b;
	 static void meth(int x) {
		 System.out.println("x = " + (x + 1));
		 System.out.println("a = " + (a + 1));
		 System.out.println("b = " + b);
	 }
	 static {
		 System.out.println("Static block initialized.");
	 	 b = a * 4;
	 }
	 
	 static void callme() {
		 System.out.println("a = " + a);
	 }
}
class Static{
	 public static void main(String args[]) {
//		 static int x = 42;// only final permitted
		 int x = 42;
		 UseStatic.meth(x);
		 // access static method
		 UseStatic.callme();
		 // access static variable
		 System.out.println("a = " + (UseStatic.a + 2 ));
		 
		 // can't access the staic var and method through any obj of the class 
//		 UseStatic obj = new UseStatic();
//		 System.out.println(obj.callme());
//		 System.out.println(obj.a);
	 }
}
